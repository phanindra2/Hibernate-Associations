package com.table;

import javax.persistence.Entity;

@Entity
public class Tester extends Employee{
	private int noofTests;
	private int noofBugss;
	public Tester() {
		
	}
	public Tester(int noofTests, int noofBugss) {
		this.noofTests = noofTests;
		this.noofBugss = noofBugss;
	}
	public int getNoofTests() {
		return noofTests;
	}
	public void setNoofTests(int noofTests) {
		this.noofTests = noofTests;
	}
	public int getNoofBugss() {
		return noofBugss;
	}
	public void setNoofBugss(int noofBugss) {
		this.noofBugss = noofBugss;
	}
	@Override
	public String toString() {
		return "Tester [noofTests=" + noofTests + ", noofBugss=" + noofBugss + "]";
	}
	
	

}
