package sce01.exam04;

public class Application {
	public static void main(String[] args) {
		
		// 객체를 생성
		// 내가 정의해놓은 class를 타입으로 사용
		KumhoTire kumho = new KumhoTire();
		// KumhoTire가 Tire를 구현하고 있으므로
		// tire로 자동 형변환된다.
		
		Tire tire = new KumhoTire();
		
		// 다형성 : 여러가지 타입을 가질 수 있는 성질
		// 1. 상속 : 자식클래스는 부모타입으로 선언할 수 있다.
		//			부모타입으로 자동 형변환된다.
		// 2. 인터페이스 : 인터페이스의 구현체는 인터페이스 타입으로 선언할 수 있다.
		//				인터페이스타입으로 자동 형변환 된다.
		
		
		// 다형성
		// 메서드재정의(오버라이딩)
		
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로
		// 인터페이스의 구현체를 매개변수로 넣어줘야 합니다.
		// 인터페이스의 구현체는 추상메서드를 모두 구현해야 하며
		// 구현체가 구현한 메서드가 실행됩니다.
		Car Hankook_car = new Car(new HankookTire());
		Car kumho_car = new Car(new KumhoTire());
		Hankook_car.run();
		System.out.println("==================");
		kumho_car.run();
	}

}
