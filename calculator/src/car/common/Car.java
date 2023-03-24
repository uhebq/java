package car.common;

public class Car {
	
	// 필드 생성
	String model;
	String color;
	int maxSpeed;
	
	// 생성자의 오버로딩
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징 2가지
	public Car(){
		// 생성자 호출
		// this. : 필드
		// 생성자를 사용하기 위해서 매개변수에 알맞은 파라메터를 넣어준다.
		this("기본모델", "블랙", 150);
	}

	// 기본생성자
	public Car(String model) {
		// model = model; 
		// -> 코드블럭 안에서는 로컬변수가 우선되므로 아무런 의미가 없음.
		this.model = model;
	}
	
	// 생성자 오버로딩
	public Car(String model, String color) {
		// 생성자를 호출하는 것은 첫 번째 줄에만 가능하다.
		this(model, color, 150);
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}
	
	public Car(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
	
}
