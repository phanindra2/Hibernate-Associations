package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.table.Developer;
import com.table.Tester;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Started");
		Configuration cfg=new Configuration();
		cfg.configure("hibernateEmp.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Developer d1=new Developer(1000,20,"python3");
		d1.setId(1);
		d1.setName("phani");
		d1.setSalary(10000);
		Developer d2=new Developer(1500,40,"java8");
		d2.setId(2);
		d2.setName("phanindra");
		d2.setSalary(20000);
		Developer d3=new Developer(1000,20,"sql");
		d3.setId(3);
		d3.setName("xyz");
		d3.setSalary(30000);
		
		Tester t1=new Tester(100,20);
		t1.setId(4);
		t1.setName("abc");
		t1.setSalary(10000);
		s.save(d2);
		s.save(d3);
		s.save(t1);
//		Developer dev=s.get(Developer.class,1);
//		System.out.println(dev);
//		System.out.println(dev.getName());
		t.commit();
		
		s.close();
		
	}

}
