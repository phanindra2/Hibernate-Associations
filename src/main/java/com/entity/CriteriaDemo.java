package com.entity;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.table.ProductTab;

public class CriteriaDemo {
	public static void main(String[] arg) {
		System.out.println("Started");
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from Product");
		List<ProductTab> l=q.list();
		l.forEach(System.out::println);
		//if we select all it will return Object of product class
		//if we select only particular colums it will return an object Array
		//we can use native sql using jdbc also
		Query q1=s.createQuery("select p.name,p.price from Product as p where p.price>1000");
		List<Object[]> lo=q1.list();
		//System.out.println(lo);
		for(Object[] o:lo) {
			for(Object obj:o) {
				System.out.print(obj+"       ");
			}
			System.out.println();
		}
		//criteria is used as alternative for sql/hql
		
		
		Criteria cr=s.createCriteria(ProductTab.class);
		List<ProductTab> l_c=cr.list(); //it will is used as select *
		l_c.forEach(System.out::println);
		//for where condition there is a class called Restrictions
		SimpleExpression sim1=Restrictions.ge("price", 1000);
		//it is simple expresssion
		//cr.add(sim);
		//if we want to add one more condition add another simple expression using restrictions
		// with the help of logical expresssion
		Criteria cr1=s.createCriteria(ProductTab.class);
		List<String> st=Arrays.asList("lofers","sneakers","slipons");
		SimpleExpression sim2=Restrictions.ge("quant", 5);
		LogicalExpression le=Restrictions.and(sim1, sim2);
		//for logical and 
		cr1.add(le);
		cr1.addOrder(Order.asc("quant"));
		List<ProductTab> l_cr=cr1.list();
		l_cr.forEach(System.out::println);
		
		//projections selecting particular  columns 
		PropertyProjection pr=Projections.property("name");
		cr.setProjection(pr);
		cr1.setProjection(pr);
		cr1.list().forEach(System.out::println);
		//selectiing multiple columns at a time
		ProjectionList pl=Projections.projectionList();
		pl.add(Projections.property("name")).add(Projections.property("price")).add(Projections.property("quant"));
		cr.setProjection(pl);
		List<Object[]> cr_l=cr.list();
		for(Object[] o:cr_l) {
			for(Object obj:o) {
				System.out.print(obj+"     ");
			}
			System.out.println();
		}
		
		
		
		t.commit();
		s.close();
		
	}

}
