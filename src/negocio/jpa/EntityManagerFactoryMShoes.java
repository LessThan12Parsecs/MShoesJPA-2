package negocio.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryMShoes {

	private static EntityManagerFactory instance = null;
	public final static String UNIDAD_DE_PERSISTENCIA = "MShoes";

	public synchronized static EntityManagerFactory getEntityManagerFactory() {

		if (instance == null)
			instance = Persistence.createEntityManagerFactory(UNIDAD_DE_PERSISTENCIA);
		return instance;
	}

	public synchronized static void closeEntityManagerFact() {
		if (instance != null) {
			instance.close();
		}
	}
}
