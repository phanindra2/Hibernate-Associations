package com.table;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	private String h_no;
	private String city;
	private int pincode;
	
	public Adress() {
		
	}
	public Adress(String h_no, String city, int pincode) {
		super();
		this.h_no = h_no;
		this.city = city;
		this.pincode = pincode;
	}
	public String getH_no() {
		return h_no;
	}
	public void setH_no(String h_no) {
		this.h_no = h_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Adress [h_no=" + h_no + ", city=" + city + ", pincode=" + pincode + "]";
	}


}
