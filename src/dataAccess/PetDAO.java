package dataAccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Pet;
import util.DBUtil;

public class PetDAO {

	public PetDAO() {
	}

	// Create new pet
	public Pet create(Pet newPet) {

		// access to DB
		EntityManager em = DBUtil.createFactory();

		em.persist(newPet);

		// Save and close
		DBUtil.commitFactory();
		DBUtil.closeFactory();
		return newPet;
	}

	// Update pet
	public Pet update(Pet updatePet) {

		// access to DB
		EntityManager em = DBUtil.createFactory();

		em.merge(updatePet);

		// Save and close
		DBUtil.commitFactory();
		DBUtil.closeFactory();
		return updatePet;
	}

	// Delete pet
	public void remove(int idPet) {

		// access to DB
		EntityManager em = DBUtil.createFactory();

		em.remove(getPet(idPet));

		// Save and close
		DBUtil.commitFactory();
		DBUtil.closeFactory();
	}

	// Get pet
	public Pet getPet(int idPet) {

		// access to DB
		EntityManager em = DBUtil.createFactory();

		Pet pet = em.find(Pet.class, idPet);

		// Close
		DBUtil.closeFactory();
		return pet;
	}

	// Get all pets in DB
	public List<Pet> getAllPets() {

		// access to DB
		EntityManager em = DBUtil.createFactory();

		List<Pet> results = em.createNamedQuery("AllPets", Pet.class).getResultList();
		// Close
		DBUtil.closeFactory();
		return results;
	}
}
