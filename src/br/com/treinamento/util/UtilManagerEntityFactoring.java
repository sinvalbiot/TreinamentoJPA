package br.com.treinamento.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilManagerEntityFactoring {
	
	static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager(){
		if ( emf == null) {
			try {
				emf = Persistence.createEntityManagerFactory("TreinamentoPU");
			} catch (Exception e) {
				System.out.println("Erro na criação da persistencia"); 
				e.printStackTrace();
			}
			
		}
		return emf.createEntityManager();
	}
	
}

