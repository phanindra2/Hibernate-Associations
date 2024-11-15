package com.entity;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.query.Query;

import com.table.Product;

public class App{
	public static void  main(String[] arg) {
		System.out.println("Started");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		//Product p=new Product(1,"shoes",1000,2);
//		Product p2=new Product(2,"sandals",1000,5);
//		Product p3=new Product(3,"flipflops",500,10);
//		Product p4=new Product(4,"lofers",800,5);
//		Product p5=new Product(5,"sneakers",1500,8);
//		Product p6=new Product(6,"slipons",1500,5);
//		Product p7=new Product(7,"slides",800,10);
//		Product p1=new Product(1,"Casual Shoes",500,5);//trancient state
		Transaction t=s.beginTransaction();
//		s.save(p2);
//		s.save(p3);
//		s.save(p4);
//		s.save(p5);
//		s.save(p6);
//	    t.commit();
		//s.flush();
		Query q=s.createQuery("from Product");
		//@SuppressWarnings("unchecked")
		List<Product> plist=q.getResultList();
		plist.forEach(System.out::println);
		Query q1=s.createQuery("select p.id,p.name from Product as p where p.price>1000");
		//if we select multiple columns it will return a object array for each row
		List<Object[]> objArr=q1.getResultList();
		for(Object[] obj:objArr) {
			for(Object o:obj) {
				System.out.print(o+"\t");
			}
			System.out.println();
		}
		
		//System.out.println(plist);
		Query q2=s.createQuery("select p.id,p.name from Product as p where p.price> ?1 ");
		q2.setInteger(1, 800);
		List<Object[]> objArr1=q2.list();
		for(Object[] obj:objArr1) {
			for(Object o:obj) {
				System.out.print(o+"\t");
			}
			System.out.println();
		}
		Query query=s.createQuery("from Product");
		query.setMaxResults(3);
		query.setFirstResult(1);
		List<Product> l=query.list();
		l.forEach(System.out::println);
		
		System.out.println("\n \n \n \n");
		System.out.println("using criteria");
		//criteria hepls to selecting without a query
		
		Criteria cr=s.createCriteria(Product.class);
		SimpleExpression si=Restrictions.ge("price",800);
		SimpleExpression si1=Restrictions.gt("quant", 10);
		LogicalExpression le=Restrictions.or(si, si1);
		
		
		cr.addOrder(Order.asc("price"));
		cr.addOrder(Order.asc("quant"));
		cr.add(le);
		
		List<Product> list=cr.list();
		list.forEach(System.out::println);
				
		Query q9=s.createQuery("select p.price from products as p where p,id="+1);
		System.out.println(q9);

		
		
		
		
		
		
		t.commit();
		s.close();
		//System.out.println(p2);// due to lazy loading we get an exception 
//		System.out.println(prod); //it will give output because of get
//		System.out.println(p1);
	}

}
