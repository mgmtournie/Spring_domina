package com.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import com.entity.Personne;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.PersonneServiceImpl;
import com.service.PersonneServiceTest;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PersonneControllerTest {

	@Autowired
	private PersonneServiceImpl personneService;
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonneServiceTest.class);

	@Autowired
	WebApplicationContext webApplicationContext;

	protected MockMvc mvc;

	@Before
	public final void setUp() {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		MockitoAnnotations.initMocks(this);
	}

	protected String uri;

	public PersonneControllerTest() {
		this.uri = "/user";

	}

	protected final String mapToJson(Object obj) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(obj);
	}

	protected final <T> T mapfromJson(String json, Class<T> clazz)
			throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(json, clazz);
	}

	@Test
	public void getAllEntityList() {
		MvcResult mvcResult;
		try {
			LOGGER.info("---------------Testing getAllEntityList Method---------------");
			LOGGER.info("---------------Constructing Personne---------------");
			LOGGER.info("---------------Saving Personne---------------");
			personneService.addPersonne(new Personne(2, "dalii"));
			LOGGER.info("---------------Mocking Context Webservice---------------");
			mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri + "/all").accept(MediaType.APPLICATION_JSON_VALUE))
					.andReturn();
			LOGGER.info("---------------Getting http Status ---------------");
			int status = mvcResult.getResponse().getStatus();
			LOGGER.info("---------------Verifying http Status ---------------");
			assertEquals(200, status);
			LOGGER.info("---------------Getting http Response ---------------");
			String content = mvcResult.getResponse().getContentAsString();
			LOGGER.info("---------------Desrialized JSON Response---------------");
			Personne[] persList = this.mapfromJson(content, Personne[].class);
			assertTrue(persList.length > 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createEntity() {
		LOGGER.info("---------------Testing getAllEntityList Method---------------");
		LOGGER.info("---------------Constructing Personne---------------");

		Personne pers = new Personne(50, "sala7");

		MvcResult mvcResult;
		try {

			LOGGER.info("---------------Seriliazing Personne Object---------------");
			String inputJson = this.mapToJson(pers);
			LOGGER.info("---------------Mocking Context Webservice and invoking it---------------");
			mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri + "/adduser")
					.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
			LOGGER.info("---------------Getting http Status ---------------");
			int status = mvcResult.getResponse().getStatus();
			LOGGER.info("---------------Verifying http Status ---------------");
			assertEquals(200, status);
			LOGGER.info("---------------Searching for Personne---------------");
			Personne persFound = personneService.findByIdUser(50);
			LOGGER.info("---------------Verifying Personne---------------");
			assertEquals(persFound.getNom(), pers.getNom());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void UpdateEntity() {
		try {

			LOGGER.info("---------------Testing UpdateEntity Method---------------");
			LOGGER.info("---------------Constructing Personne---------------");

			Personne oldPers = new Personne(7, "Lemon");
			LOGGER.info("---------------Saving Personne---------------");

			personneService.addPersonne(oldPers);
			LOGGER.info("---------------Modifying Personne---------------");

			Personne newPers = new Personne(7, "Lemonade");
			LOGGER.info("---------------Seriliazing Personne Object---------------");

			String inputJson = this.mapToJson(newPers);
			LOGGER.info("---------------Mocking Context Webservice and invoking it---------------");

			MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.put(uri + "/7")
					.contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
			LOGGER.info("---------------Getting http Status ---------------");

			int status = mvcResult.getResponse().getStatus();
			LOGGER.info("---------------Verifying http Status ---------------");

			assertEquals(200, status);
			LOGGER.info("---------------Searching for Personne---------------");

			Personne persFound = personneService.findByIdUser(2);
			LOGGER.info("---------------Verifying Personne---------------");
			assertEquals(persFound.getNom(), newPers.getNom());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void DeleteEntity() {
		LOGGER.info("---------------Testing DeleteEntity Method---------------");
		try {

			LOGGER.info("---------------Constructing Personne---------------");
			LOGGER.info("---------------Saving Personne---------------");
			personneService.addPersonne(new Personne(6, "Lemon"));

			LOGGER.info("---------------Mocking Context Webservice and invoking it---------------");

			MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.delete(uri + "/6")).andReturn();
			LOGGER.info("---------------Getting http Status ---------------");

			int status = mvcResult.getResponse().getStatus();
			LOGGER.info("---------------Verifying http Status ---------------");

			assertEquals(200, status);
			LOGGER.info("---------------Searching for Personne---------------");

			Personne persFound = personneService.findByIdUser(6);
			LOGGER.info("---------------Verifying Personne---------------");
			assertEquals(persFound, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
