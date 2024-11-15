package com.table;

import javax.persistence.*;

@Entity
//@Table(name="employee_tab") creates a sigle table for all subclasses which inherited this class
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=InheritanceType.JOINED) //it will create primary key forign key based approch  it will create table for each sub and parent class
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) // it will create a table for each subclass and stores parentclass info also in same table

public class Employee {
	@Id
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name")
	private String name;
	private int salary;
	public Employee() {
		
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
