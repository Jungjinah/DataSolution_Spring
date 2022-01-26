package com.ddargiratte.jan252.stock;

public class Stock {
	private String name;
	private int price;
	
	public Stock() {
		System.out.println("주식 생성");
	}

	public Stock(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
