package br.com.treinamento.teste;

import javax.persistence.EntityManager;


import br.com.treinamento.modelo.Pais;
import br.com.treinamento.util.UtilManagerEntityFactoring;

public class TestePais {
	public static void main(String[] args) {
		
//		Pais p = new Pais();
//		p.setNome("USA");
//		p.setIso("us");
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TreinamentoPU");
//		EntityManager em = emf.createEntityManager();
//		//EntityManager em = UtilManagerEntityFactoring.getEntityManager();
//		em.getTransaction().begin();
//		em.persist(p);
//		em.getTransaction().commit();
//		em.close();	
		
		Pais p = new Pais();
		
		EntityManager em = UtilManagerEntityFactoring.getEntityManager();
		
		p = em.find(Pais.class,2);
//		p.setIso("BRA");
//		em.getTransaction().begin();
//		em.merge(p);
//		em.getTransaction().commit();
//		em.close();
		em.getTransaction().begin();
		em.remove(p);		
		em.getTransaction().commit();
		em.close();
		
	}

}
