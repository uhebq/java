package com.kh.practice.model.vo;

public class Cat extends Animal {
	private String location;
	private String color;
	
	public Cat() {
		
	}

	public Cat(String name, String kinds, String location, String color) {
		// 부모의 생성자를 호출하여 필드값을 초기화
		super(name, kinds);
		// 필드 초기화
		setLocation(location);
		setColor(color);
//		this.location = location;
//		this.color = color;
	}

	@Override
	public void speak() {
		System.out.println(super.toString() 
				+ location + "에 서식하며, 색상은 " + color + "입니다.");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
