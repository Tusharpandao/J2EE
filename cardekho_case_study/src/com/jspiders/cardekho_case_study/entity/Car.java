package com.jspiders.cardekho_case_study.entity;

public class Car {
	
	private int car_id;
	private String name;
	private String brand;
	private String fuel_type;
	private double price;
	
	public Car(int car_id2, String name2, String brand2, String model, String fuelType, double price2) {
		// TODO Auto-generated constructor stub
	}
	public Car() {
		
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
