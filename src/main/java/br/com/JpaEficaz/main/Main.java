package br.com.JpaEficaz.main;

import javax.persistence.EntityManager;

import br.com.JpaEficaz.util.JpaUtil;

public class Main {

	public static void main(String[] args) {
		EntityManager entityManager = JpaUtil.getEntityManager();
		
		try{
			entityManager.getTransaction().begin();
			// faz algo
			entityManager.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			e.getMessage();
		}finally{
			entityManager.close();
		}
	}
}
