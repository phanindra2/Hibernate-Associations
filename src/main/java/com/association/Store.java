package com.association;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Store{
	@Id
	private int id;
	private String name;
	@ManyToMany
	private Set<Product> products;
	public Store(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Store() {
		
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
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	

}
