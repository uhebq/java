package com.kh.object.practice;

public class Product {
	// 필드
	private String id;
	private String name;
	private String site;
	private int price;
	private double tax;
	
	//생성자
	public Product() {
	}
		
	public Product(String id, String name, String site, int price, double tax) {
		this.id = id;
		this.name = name;
		this.site = site;
		this.price = price;
		this.tax = tax;
	}
	
	// 메서드
	/**
	 * 모든 필드의 정보를 출력합니다.
	 * @return
	 */
	public String information() {
//		return id + " " + name + " " + site + " " + price + " " + tax;
		return getId() + " " + getName() + " " + getSite()
				+ " " + getPrice() + " " + getTax();
	}
	
	/**
	 * 가격을 계산하고 출력합니다.
	 */
	public void calc() {
		System.out.println("상품명 = " + getName());
//		System.out.println("부가세를 포함한 가격 = "
//					+ (int)(getPrice() + (getPrice()*getTax())) + "원");
		int res = (int)(getPrice() + (getPrice()*getTax()));
		System.out.println("부가세를 포함한 가격 = " + res + "원");
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}