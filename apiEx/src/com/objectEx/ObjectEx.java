package com.objectEx;

/**
 * 1. API(Application Programing Interface)
 * 	- API는 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있게 만든 인터페이스를 뜻한다.
 * 	- 자바에서는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스 모음을 말한다.
 * 		(라이브러리라고 부르기도 한다.)
 * @author user
 *
 */

public class ObjectEx {
	public static void main(String[] args) {
		String str = "";
		print(str);
		System.out.println("===========");
		
		int num = 0; // => Integer => Object
		// int 타입은 기본타입이므로 Object 타입으로 변환되지 않는다.
		// int 타입을 객체형태로 변환해야 합니다.
		// ==> Wrapper 클래스인 Integer타입으로 자동 형변환 되어져서 들어간다.
		
		// int -> Integer (자동형변환)
		// double -> Double
		// 기본타입 : 값 자체가 저장
		// 참조타입 : 주소가 저장
		// num. 주소접근연산자
		// Object 형변환의 최상위 계층
		
		print(num);
		System.out.println("===========");
		
		ObjectEx objEx = new ObjectEx();
		print(objEx);
		
	}
	
	public static void print(Object obj) {
		// Object 클래스에 toString이 정의되어 있지만
		// 메서드의 오버라이딩에 의해서
		// String 클래스, Integer 클래스에 정의되어 있는 메서드가 호출된다.
		
		// 클래스이름 @16진수 주소값을 반환
		System.out.println(obj.toString());
		
		// 두 객체가 가지고 있는 주소값을 비교합니다.
		// 주소가 같으면 true, 다르면 false를 출력합니다.
		
	}
	
	
}