package car.common;

public class Carmain {

	public static void main(String[] args) {
		
		// 생성자를 호출할때는
		// 생성자의 매개변수 타입에 맞춰서 순서대로 입력해줘야 한다.
		
		// 메소드 또는 생성자의 위치로 이동하는 방법
		// F3 또는 Ctrl + 클릭
		
		Car car = new Car();
		System.out.println("car ============");
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.maxSpeed);

		Car car1 = new Car("그랜저");
		System.out.println("car1 ============");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		
		Car car2 = new Car("SM5", 200);
		System.out.println("car ============");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		
		Car car3 = new Car("소나타", "블랙", 200);
		System.out.println("car ============");
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		
//		Car car = new Car();
//		Car car1 = new Car("그랜저");
//		Car car2 = new Car("SM5",0);
//		Car car3 = new Car("소나타", "블랙", 200);
//		

	}

}
