package com.association;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	private int branch_id;
	private String branch_name;
	
	@OneToMany(mappedBy="branch")
	Set<People> people;
	
	
	
	public Branch(int branch_id, String branch_name) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
	}
	
	
	public Set<People> getPeople() {
		return people;
	}
	public void setPeople(Set<People> people) {
		this.people = people;
	}
	public Branch() {
		
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + "]";
	}
	

}






