package com.entity;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.Battery;
import com.association.Mobile;

public class MobileMain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernateMobile.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		Battery b1=new Battery(1,4500,"sony");
//		Mobile m1=new Mobile(123,"iqoo",35000);
//		Battery b2=new Battery(2,5500,"sam");
//		Mobile m2=new Mobile(101,"Mi",25000);
//		Battery b1=new Battery(1,4500,"sony");
//		m2.setBattery(b2);
//		s.save(b2);
//		s.save(m2);
		Mobile m=s.get(Mobile.class, 101);//you get battery and mobiles details 
		//Battery b=s.get(Battery.class, 1);// but you only get battery details that is uni directional
		//System.out.println(b);
		System.out.println(m.getBattery());//bychanging onetone annotation
		System.out.println(m);// by default it is eagerloading (means battery details also comes with this)
		//for not getting battery details we need to change the type to (@OneToOne(fetch=FetchType.LAZY))
		Battery b=s.get(Battery.class, 1);
		System.out.println(b.getMobile());
		t.commit();
		s.close();
		
		

	}

}
