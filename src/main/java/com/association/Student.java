package com.association;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student{
	@Id
	private int id;
	private String name;
	private int phno;
	private int age;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Department dept;
	
	public Student(int id, String name, int phno, int age) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.age = age;
	}
	
	public Student() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phno=" + phno + ", age=" + age + "]";
	}
	
	
	
	

}
