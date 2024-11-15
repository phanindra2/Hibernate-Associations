package com.association;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Battery_tab")
public class Battery {
	@Id
	private int batteryId;
	private int capacity;
	private String company;
	
	@OneToOne(mappedBy="battery", cascade=CascadeType.ALL)
	Mobile mobile;
	
	public Battery() {
	}
	public Battery(int batteryId, int capacity, String company) {
		super();
		this.batteryId = batteryId;
		this.capacity = capacity;
		this.company = company;
	}
	public int getBatteryId() {
		return batteryId;
	}
	public void setBatteryId(int batteryId) {
		this.batteryId = batteryId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Battery [batteryId=" + batteryId + ", capacity=" + capacity + ", company=" + company + "]";
	}
	
	
	

}
