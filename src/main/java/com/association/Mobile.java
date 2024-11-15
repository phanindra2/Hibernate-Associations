package com.association;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mobile_tab")
public class Mobile {
	
	@Id
	private int imei;
	private String company;
	private int cost;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	//lazy fetching helps in getting details of battery only needed not at mobile object extraction 
	//cascadeType all helps to delete both objects(battery and mobile) if we delete one it deletes both records from db
	private Battery battery;
	
	
	public Mobile() {
		
	}
	public Mobile(int imei, String company, int cost) {
		this.imei = imei;
		this.company = company;
		this.cost = cost;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Mobile [imei=" + imei + ", company=" + company + ", cost=" + cost + ", battery=" + battery + "]";
	}
	
	
	
	

}
