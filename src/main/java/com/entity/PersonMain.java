package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.table.Adress;
import com.table.Person;

public class PersonMain {
	public static void main(String[] arg) {
		System.out.println("started");
		Configuration cfg=new Configuration();
		cfg.configure("hibernatePerson.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		System.out.println(sf);
		//Person p1=new Person(1,"phani",21);
		//p1.setAddr(new Adress("1-2 vempadu","Ongole",523265));
		//s.save(p1);
		Person p=s.get(Person.class, 1);
		System.out.println(p);
		t.commit();
		s.close();
		
	}

}
