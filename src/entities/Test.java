package entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import managedBeans.PetMB;

//import managedBeans.PetMB;

public class Test {

	private static final String PERSISTENCE_UNIT_NAME = "AdoptPets";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
	
//		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//		EntityManager em = factory.createEntityManager();
//
//		// create new pet
//		em.getTransaction().begin();
//		Pet pet = new Pet();
//		pet.setPetName("valeria");
//		pet.setShortDesc("Test");
//		em.persist(pet);
//		em.getTransaction().commit();
//
//		em.close();
		
//		PetMB pet = new PetMB();
//		
//		List<Pet> pets = pet.getAllPets();

	}

}
