package com.table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	@Id
	private int itemId;
	private String itemName;
	private int qunat;
	public Item(int itemId, String itemName, int qunat) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.qunat = qunat;
	}
	public Item() {
		
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQunat() {
		return qunat;
	}
	public void setQunat(int qunat) {
		this.qunat = qunat;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", qunat=" + qunat + "]";
	}
	
	
	
	

}
