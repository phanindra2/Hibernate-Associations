package com.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.table.Item;


public class ItemMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("items_details");  
		
		EntityManager em=emf.createEntityManager(); 
		EntityTransaction t=em.getTransaction();
		Item item=new Item(1,"xyz",10);
		t.begin();
		em.persist(item);
		t.commit();
		em.close();
		emf.close();
		

	}

}
