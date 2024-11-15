package com.table;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_tab")
public class Person{
	@Id
	private int id;
	private String name;
	private int age;
	@Embedded
	private Adress addr;
	public Person() {
		
	}
	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Adress getAddr() {
		return addr;
	}
	public void setAddr(Adress addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	

}
