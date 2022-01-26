package com.ddargiratte.jan252.animation;

public class Animation {
	private String title;
	private String name;
	private int year;
	
	public Animation() {
		// TODO Auto-generated constructor stub
	}

	public Animation(String title, String name, int year) {
		super();
		this.title = title;
		this.name = name;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
