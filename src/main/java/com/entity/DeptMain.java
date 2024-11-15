package com.entity;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.Department;
import com.association.Student;

public class DeptMain{
	public static void main(String[] arg) {
//		Student s1=new Student(1,"phani",12345,21);
//		Student s2=new Student(2,"abc",12345,21);
//		Student s3=new Student(3,"xyz",12345,21);
//		Student s4=new Student(4,"pqr",12345,21);
//		Student s5=new Student(5,"abcd",12345,21);
//		Student s6=new Student(6,"phanindra",12345,21);
//		Student s7=new Student(7,"uvw",12345,21);
//		Student s8=new Student(8,"lmn",12345,21);
//		Student s9=new Student(9,"phani",12345,21);
//		Student s10=new Student(10,"sandy",12345,21);
//		Student s11=new Student(11,"nani",12345,21);
//		Student s12=new Student(12,"praveen",12345,21);
//		Student s13=new Student(13,"raja",12345,21);
//		Student s14=new Student(14,"vijay",12345,21);
//		Student s15=new Student(15,"sandeep",12345,21);
//		List<Student> ls1=new ArrayList<>();
//		List<Student> ls2=new ArrayList<>();
//		ls1.add(s1);
//		ls1.add(s2);
//		ls1.add(s3);
//		ls1.add(s4);
//		ls1.add(s5);
//		ls1.add(s6);
//		ls1.add(s7);
//		ls2.add(s15);
//		ls2.add(s14);
//		ls2.add(s13);
//		ls2.add(s12);
//		ls2.add(s11);
//		ls2.add(s10);
//		ls2.add(s9);
//		ls2.add(s8);
//		Department d1=new Department(101,"finance");
//		Department d2=new Department(102,"sales");
//		for(Student s:ls1) {
//			s.setDept(d1);
//		}
//		for(Student s:ls2) {
//			s.setDept(d2);
//		}
		
		
		
		
		Configuration cf=new Configuration();
		cf.configure("hibernateDepartment.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		// if manytoOne at student side is not mentioned then it will create a third table dept_students it is not a good practice 
		//so we are adding an annotation at the side of students also then it will create two tables with a fk
		//one to many (one directional)
//		s.save(d1);
//		s.save(d2);
//		s.save(s1);
//		s.save(s2);
//		s.save(s3);
//		s.save(s4);
//		s.save(s5);
//		s.save(s6);
//		s.save(s7);
//		s.save(s8);
//		s.save(s9);
//		s.save(s10);
//		s.save(s11);
//		s.save(s12);
//		s.save(s13);
//		s.save(s14);
//		s.save(s15);
//		s.save(d1);
//		s.save(d2); 
		Department d=s.load(Department.class,101);
		System.out.println(d);
		
		
		
		
		t.commit();
		s.close();
	}

}
