//package com.service;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import java.util.Arrays;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.entity.Personne;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class PersonneServiceTest {
//
//	@Before
//	public final void setUp() {
//		MockitoAnnotations.initMocks(this);
//	}
//	private static final Logger LOGGER = LoggerFactory.getLogger(PersonneServiceTest.class);
//
//	@Autowired
//	private PersonneService personneService ;
//
//	@Autowired
//	@Mock
//	private PersonneService personneServiceToMock;
//	
//	@Test
//	public void should_Give_AllPersonnes(){
//		LOGGER.info("---------------Testing should_Give_AllPersonnes Method---------------");
//		LOGGER.info("---------------Constructing Users---------------");
//		// userServiceToMock = Mockito.mock(UserService.class); instead of
//		// annotation
//		LOGGER.info("---------------Mocking getAll() Method---------------");
//		Mockito.when(personneServiceToMock.getAllPersonnes()).thenReturn(Arrays.asList(new Personne("DAD", "dalliii"),
//				new Personne("MUM", "dalliii"), new Personne("SIS", "dalliii"), new Personne("SON", "dalliii")));
//		LOGGER.info("---------------Method Mocked---------------");
//		LOGGER.info("---------------verifing result--------------");
//		assertEquals(4, personneServiceToMock.getAllPersonnes().size());
//	}
//	@Test
//	public void should_add_a_Personne(){
//		LOGGER.info("---------------Testing should_add_a_Personne Method---------------"); 
//		Personne addedUser = personneService.addPersonne(new Personne("DAD", "dalii")); 
//		LOGGER.info("---------------Personne saved---------------");
//		LOGGER.info("---------------Searching for Personne---------------");
//		Personne foundUser= personneService.findByUsername("DAD");
//		LOGGER.info("---------------Personne found---------------");
//		LOGGER.info("---------------Verifiying  Personne---------------");
//		assertNotNull(foundUser);
//		assertEquals(addedUser.getNom(), foundUser.getNom());
//		LOGGER.info("---------------Personne Verified---------------");
//	}
//	@Test
//	public void should_Find_By_Username(){
//		LOGGER.info("---------------Testing should_Find_By_Username Method---------------"); 
//		Personne addedUser = personneService.addPersonne(new Personne("DiAD", "dalii")); 
//		LOGGER.info("---------------Personne saved---------------");
//		LOGGER.info("---------------Searching for Personne---------------");
//		Personne foundUser= personneService.findByUsername("DiAD");
//		LOGGER.info("---------------Personne found---------------");
//		LOGGER.info("---------------Verifiying  Personne---------------");
//		assertNotNull(foundUser);
//		assertEquals(addedUser.getNom(), foundUser.getNom());
//		LOGGER.info("---------------Personne Verified---------------");
//	}
//	
//}
