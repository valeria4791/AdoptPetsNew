package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final String PERSISTENCE_UNIT_NAME = "AdoptPets";
	private static EntityManagerFactory factory;
	private static EntityManager em;

	// Create Entity manager for access to DB
	public static EntityManager createFactory() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
		getFactory();
		return em;
	}

	// Open transaction to DB
	public static EntityManager getFactory() {
		if (!em.getTransaction().isActive())
			em.getTransaction().begin();
		return em;
	}
	
	// Commit data
	public static void commitFactory() {
		if (em.getTransaction().isActive()) {
			em.getTransaction().commit();
		}
	}

	// Close Entity manager
	public static void closeFactory() {
		em.close();
	}
}
