package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import com.table.Animal;

public class AnimalMain {
	public static void main(String[] arg) {
		//RegionFactory
		//EhCacheRegionFactory

		Configuration cf=new Configuration();
		cf.configure("hiberNateSecond.cfg.xml");
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hiberNateSecond.cfg.xml").build();  
//	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build(); 
//		SessionFactory sf=meta.getSessionFactoryBuilder().build();     c
		SessionFactory sf=cf.buildSessionFactory();
		//Animal a1=new Animal(3,"rotv","dog",8000);
		Session s1=sf.openSession();
		//Transaction t1=s1.beginTransaction();
		Animal a=s1.get(Animal.class, 2);
		System.out.println(a);
		//s1.save(a1);
		s1.close();
		
		Session s2=sf.openSession();
		//Transaction t2=s2.beginTransaction();
		Animal x=s2.get(Animal.class, 2);
		System.out.println(x);
		//t2.commit();
		s2.close();
		
	}

}
