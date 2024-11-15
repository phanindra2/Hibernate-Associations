package com.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.Author;
import com.association.Book;

public class BookMain {

	public static void main(String[] args) {
//		Author a1=new Author(1,"abc");
//		Author a2=new Author(2,"xyz");
//		Book b1=new Book(101,"cp",1000);
//		Book b2=new Book(102,"java",1500);
//		Book b3=new Book(103,"python",800);
//		Book b4=new Book(104,"html",1300);
//		Set<Book> author1=new HashSet<>();
//		Set<Book> author2=new HashSet<>();
//		author1.add(b1);
//		author1.add(b4);
//		author2.add(b2);
//		author2.add(b3);
//		a1.setBooks(author1);
//		a2.setBooks(author2);
		Configuration cf=new Configuration();
		cf.configure("hibernateBook.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
//		s.save(b1);
//		s.save(b2);
//		s.save(b3);
//		s.save(b4);
//		s.save(a1);
//		s.save(a2);
		Author a=s.get(Author.class, 1);
		System.out.println(a);
		
		
		
		Book b=s.get(Book.class,104);
		System.out.println(b.getAuthors());
		t.commit();
		s.close();

	}

}
