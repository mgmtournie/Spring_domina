package com.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.DAO.PersonneDAO;
import com.entity.Personne;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonneServiceTest {

	private PersonneServiceImpl personneService;
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonneServiceTest.class);

	@Mock
	private PersonneDAO personneDAO;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		personneService = new PersonneServiceImpl(personneDAO);
	}

	@Test
	public void should_store_when_add_is_called() {
		LOGGER.info(
				"--------------- Executing should_store_when_save_is_called test Of PersonneServiceImplTest ---------------");
		Personne myPersonne = new Personne();
		personneService.addPersonne(myPersonne);
		Mockito.verify(personneDAO).save(myPersonne);
	}

	@Test
	public void should_update_when_update_is_called() {
		LOGGER.info(
				"--------------- Executing should_store_when_save_is_called test Of PersonneServiceImplTest ---------------");
		Personne myPersonne = new Personne();
		personneService.updatePersonne(myPersonne);
		Mockito.verify(personneDAO).save(myPersonne);
	}

	@Test
	public void should_search_by_id_when_findById_is_called() {
		LOGGER.info(
				"--------------- Executing should_search_by_id_when_findById_is_called test Of PersonneServiceImplTest ---------------");
		Integer id = new Integer(1);
		personneService.findByIdUser(id);
		Mockito.verify(personneDAO).findByIdUser(id);
	}

	@Test
	public void should_search_by_name_when_findByName_is_called() {
		LOGGER.info(
				"--------------- Executing should_search_by_name_when_findByName_is_called test Of PersonneServiceImplTest ---------------");
		String name = new String("bob");
		personneService.findByNom(name);
		Mockito.verify(personneDAO).findByNom(name);
	}

	@Test
	public void should_search_all_when_getAllPersonnes_is_called() {
		LOGGER.info(
				"--------------- Executing should_search_all_when_getAllPersonnes_is_called test Of PersonneServiceImplTest ---------------");
		Personne p1 = new Personne(1, "BOB");
		Personne p2 = new Personne(2, "SAM");
		personneService.addPersonne(p1);
		personneService.addPersonne(p2);

		personneService.getAllPersonnes();
		Mockito.verify(personneDAO).findAll();
	}

	@Test
	public void should_delete_when_deletePersonne_is_called() {
		LOGGER.info(
				"--------------- Executing should_delete_when_deletePersonne_is_called test Of PersonneServiceImplTest ---------------");
		Personne p = new Personne();
		personneService.deletePersonne(p);
		Mockito.verify(personneDAO).delete(p);
	}

	@Test
	public void should_search_by_username_when_findByUsername_is_called() {
		LOGGER.info(
				"--------------- Executing should_search_by_username_when_findByUsername_is_called test Of PersonneServiceImplTest ---------------");
		String username = new String("BOBBY");
		personneService.findByUsername(username);
		Mockito.verify(personneDAO).findByUsername(username);
	}
}
