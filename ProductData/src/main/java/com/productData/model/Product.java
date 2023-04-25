package com.productData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
      @Id
      private int id;
      private String name;
      private int cost;
      private String brand;
	   public int getid()
	   {
		   return id;
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
