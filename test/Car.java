package com.sp.project0621.test;

public class Car{
    private int price=10;
	private boolean hybrid=false;
	private String brand="����";

	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}

	public void setHybrid(boolean hybrid){
		this.hybrid=hybrid;
	}
	public boolean getHybrid(){
		return hybrid;
	}

	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
}
