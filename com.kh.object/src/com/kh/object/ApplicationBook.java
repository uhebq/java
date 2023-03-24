package com.kh.object;

import com.kh.object.practice.Book;

public class ApplicationBook {
	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석", 20000, 0.2, "윤상섭");
		
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println("===================");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		
		System.out.println("수정된 결과 확인");
		System.out.println(book1.information());
		System.out.println("===================");

		book1.calc();
		book2.calc();
	}

}
