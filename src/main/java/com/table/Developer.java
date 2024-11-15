package com.table;

import javax.persistence.Entity;

@Entity
public class Developer extends Employee {
	private int noofLines;
	private int noofMethods;
	private String tech;
	
	public Developer(int noofLines, int noofMethods, String tech) {
		this.noofLines = noofLines;
		this.noofMethods = noofMethods;
		this.tech = tech;
	}
	public Developer() {
		
	}
	public int getNoofLines() {
		return noofLines;
	}
	public void setNoofLines(int noofLines) {
		this.noofLines = noofLines;
	}
	public int getNoofMethods() {
		return noofMethods;
	}
	public void setNoofMethods(int noofMethods) {
		this.noofMethods = noofMethods;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Developer [noofLines=" + noofLines + ", noofMethods=" + noofMethods + ", tech=" + tech + "]";
	}
	

}
