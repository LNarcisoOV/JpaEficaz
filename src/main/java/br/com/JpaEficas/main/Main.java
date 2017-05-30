package br.com.JpaEficas.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MeuPU");

	public static void main(String[] args) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		// faz algo
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
