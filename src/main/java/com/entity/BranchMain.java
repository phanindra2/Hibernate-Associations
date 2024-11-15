package com.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.Branch;
import com.association.People;

public class BranchMain {

	public static void main(String[] args) {
//		Branch b1=new Branch(1,"xyz");
//		Branch b2=new Branch(2,"pqr");
//		People p1=new People(101,"abc",21);
//		People p6=new People(106,"abc",21);
//		People p2=new People(102,"abc",21);
//		People p3=new People(103,"abc",21);
//		People p4=new People(104,"abc",21);
//		People p5=new People(105,"abc",21);
//		Set<People> branch1=new HashSet<>();
//		branch1.add(p1);
//		branch1.add(p2);
//		branch1.add(p3);
//		Set<People> branch2=new HashSet<>();
//		branch2.add(p4);
//		branch2.add(p5);
//		branch2.add(p6);
//		for(People p:branch1) {
//			p.setBranch(b1);
//			
//		}
//		for(People p:branch2) {
//			p.setBranch(b2);
//		}
//		b1.setPeople(branch1);
//		b2.setPeople(branch2);
//		
		
		
		
		Configuration cf=new Configuration();
		cf.configure("hibernateBranch.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		s.save(p1);
//		s.save(p2);
//		s.save(p3);
//		s.save(p4);
//		s.save(p5);
//		s.save(p6);
//		s.save(b1);
//		s.save(b2);
		Branch b=s.get(Branch.class, 1);
		System.out.println(b);
		System.out.println(b.getPeople());
		People p=s.get(People.class,101);
		System.out.println(p);
		System.out.println(p.getBranch());
		
		
		t.commit();
		s.close();

	}

}
