package sce01.exam04;

public class Car {
	// 인터페이스는 객체를 생성할 수 없다.
	// Tire tire = new Tire();  <-- 오류
	// 인터페이스의 구현체인 경우,
	// 인터페이스를 참조변수의 타입으로 사용할 수 있다.
	Tire tire;
	
	// 생성자의 매개변수로 인터페이스가 사용된 경우
	public Car(Tire tire) {
		this.tire = tire;
	}
	public void run() {
		tire.roll();
	}
}
