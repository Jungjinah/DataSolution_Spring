package com.ddargiratte.jan254.fruit;

// 객체를 등록 -> src/main/resources/XXXBeans.xml...
	// 이 프로젝트 구조를 잘 보면 이 두가지가 있음(src->main->webapp...)
//		root-context.xml	-> Tomcat에 실려있는 프로젝트 전체에 영향
//		servlet-context.xml	-> 이 프로젝트에만 영향을 줌
//			ㄴ 여기에 객체 등록

public class Fruit {
	private String name;
	private int price;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}

	public Fruit(String name, int price) {
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
