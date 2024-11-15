package com.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.Product;
import com.association.Store;

public class StoreMain {

	public static void main(String[] args) {
		
		Store s1=new Store(1,"supmarket");
		Store s2=new Store(2,"More");
		Product p1=new Product(101,"brush",20);
		Product p2=new Product(102,"paste",30);
		Product p3=new Product(103,"chocolates",50);
		Set<Product> store1=new HashSet<>();
		Set<Product> store2=new HashSet<>();
     	store1.add(p1);
		store1.add(p3);
		s2.setProducts(store1);
		store2.add(p2);
		store2.add(p1);
		store2.add(p3);
		s1.setProducts(store2);
		
		
		Configuration cf=new Configuration();
		cf.configure("hibernateStore.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(s1);
		s.save(s2);
		
		t.commit();
		s.close();

	}

}
