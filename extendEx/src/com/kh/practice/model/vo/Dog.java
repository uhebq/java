package com.kh.practice.model.vo;

public class Dog extends Animal {
	// 상수는 static final로 정의
	public static final String PLACE = "애견카페";

	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		setWeight(weight);
		// this.weight = weight;
	}

	@Override
	public void speak() {
		// 부모의 메서드를 호출
		String str = super.toString();
		System.out.println(str + "몸무게는 " + weight + "kg 입니다.");
		
	}


	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	

}

