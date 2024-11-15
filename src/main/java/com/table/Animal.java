package com.table;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
//@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE) // these are used as modes reading writing  for caching

public class Animal {
	@Id
	private int id;
	private String name;
	private String type;
	private int cost;
	public Animal(int id, String name, String type, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.cost = cost;
	}
	public Animal() {
		super();
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", type=" + type + ", cost=" + cost + "]";
	}
	
	
	
	

}
