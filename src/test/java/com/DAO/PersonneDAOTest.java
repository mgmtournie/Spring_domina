package com.DAO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.entity.Personne;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonneDAOTest {

	@Autowired
	private PersonneDAO personneDAO;
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonneDAOTest.class);

	@Test
	public void givenEntityRepository_whenSaving() {
		LOGGER.info("---------------Testing givenEntityRepository_whenSaving Method---------------");
		Personne addedpersonne = personneDAO.save(new Personne(02, "babar"));
		LOGGER.info("---------------Personne saved---------------");
		LOGGER.info("---------------Searching for Personne---------------");
		Personne foundPersonne = personneDAO.findByNom(addedpersonne.getNom());
		LOGGER.info("---------------Personne found---------------");
		LOGGER.info("---------------Verifiying  Personne---------------");
		assertNotNull(foundPersonne);
		assertEquals(addedpersonne.getNom(), foundPersonne.getNom());
		LOGGER.info("---------------Personne Verified---------------");
	}

	@Test
	public void givenEntityRepository_whenUpdating() {
		LOGGER.info("---------------Testing givenEntityRepository_whenUpdating Method---------------");
		Personne addedpersonne = personneDAO.save(new Personne(02, "Babar"));
		LOGGER.info("---------------Personne saved---------------");
		LOGGER.info("---------------Update for Personne---------------");
		Personne updatePersonne = personneDAO.save(new Personne(addedpersonne.getIdUser(), "Bambi"));
		LOGGER.info("---------------Personne found---------------");
		LOGGER.info("---------------Verifiying  Personne---------------");
		assertNotNull(updatePersonne);
		assertEquals("Bambi", updatePersonne.getNom());
		LOGGER.info("---------------Personne Verified---------------");
	}

	@Test
	public void givenEntityRepository_whenDeleting() {
		LOGGER.info("---------------Testing givenEntityRepository_whenDeleting Method---------------");
		Personne deletePersonne = personneDAO.save(new Personne(13, "dalii"));
		LOGGER.info("---------------Personne saved---------------");
		LOGGER.info("---------------suppr for Personne---------------");
		personneDAO.delete(deletePersonne);
		LOGGER.info("---------------Personne found---------------");
		LOGGER.info("---------------Verifiying  NON-Personne---------------");
		Personne deletedUSer = personneDAO.findByNom(deletePersonne.getNom());
		assertNull(deletedUSer);
		LOGGER.info("---------------NON-Personne Verified---------------");
	}

	@Test
	public void givenEntityRepository_whenRetrievingOneByName() {
		LOGGER.info("---------------Testing givenEntityRepository_whenRetrievingOneById Method---------------");
		Personne addedPersonne = personneDAO.save(new Personne(15, "anna"));
		LOGGER.info("---------------User saved---------------");
		LOGGER.info("---------------Searching for User---------------");
		Personne foundPersonne = personneDAO.findByNom(addedPersonne.getNom());
		LOGGER.info("---------------User found---------------");
		LOGGER.info("---------------Verifiying  User---------------");
		assertNotNull(foundPersonne);
		assertEquals(addedPersonne.getNom(), foundPersonne.getNom());
		LOGGER.info("---------------User Verified---------------");
	}
	
	@Test
	public void givenEntityRepository_whenRetrievingOneByUsername() {
		LOGGER.info("---------------Testing givenEntityRepository_whenRetrievingOneById Method---------------");
		Personne addedPersonne = personneDAO.save(new Personne(15, "anna"));
		addedPersonne.setUsername("DAD");
		personneDAO.save(addedPersonne); 
		LOGGER.info("---------------User saved---------------");
		LOGGER.info("---------------Searching for User---------------");
		Personne foundPersonne = personneDAO.findByUsername(addedPersonne.getUsername());
		LOGGER.info("---------------User found---------------");
		LOGGER.info("---------------Verifiying  User---------------");
		assertNotNull(foundPersonne);
		assertEquals(addedPersonne.getUsername(), foundPersonne.getUsername());
		LOGGER.info("---------------User Verified---------------");
	}

	@Test
	public void givenEntityRepository_whenRetrievingOneByIdUser() {
		LOGGER.info("---------------Testing givenEntityRepository_whenRetrievingOneByIdUser Method---------------");
		Personne addedPersonne = personneDAO.save(new Personne(15, "anna"));
		LOGGER.info("---------------User saved---------------");
		LOGGER.info("---------------Searching for User---------------");
		Personne foundPersonne = personneDAO.findByIdUser(addedPersonne.getIdUser());
		LOGGER.info("---------------User found---------------");
		LOGGER.info("---------------Verifiying  User---------------");
		assertNotNull(foundPersonne);
		assertEquals(addedPersonne.getIdUser(), foundPersonne.getIdUser());
		LOGGER.info("---------------User Verified---------------");
	}
}
