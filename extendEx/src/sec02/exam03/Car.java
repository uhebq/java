package sec02.exam03;

public class Car {
	// 초기값 : null
	private Tire tireFR;
	private Tire tireFL;
	private Tire tireBR;
	private Tire tireBL;
	
	
	public Car(Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
		// 생성자
		// 타이어 필드를 초기화
		tireFR = tire1;
		tireFL = tire2;
		tireBR = tire3;
		tireBL = tire4;
		
//		tireFR = new Tire("오른쪽앞", 3);
//		tireFL = new Tire("왼쪽앞", 5);
//		tireBR = new Tire("오른쪽뒤", 1);
//		tireBL = new Tire("왼쪽뒤", 10);
		
	}
	/**
	 * 바퀴를 굴려줍니다
	 * @return 
	 */
	public int run() {
		System.out.println("타이어가 굴러갑니다");
		boolean next = tireFR.roll();
		// 타이어 교체
		// false이면 교체해야 돼
		if(!next) {
			System.out.println(tireFR.location + "타이어 교체");
			return 1;
		}
		if(!tireFL.roll()) {
			System.out.println(tireFL.location + "교체");
			return 2;
		}
		if(!tireBR.roll()) {
			System.out.println(tireBR.location + "교체");
			return 3;
		}
		if(!tireBL.roll()) {
			System.out.println(tireBL.location + "교체");
			return 4;
		}
		
		return 0;
	}
	
	/**
	 * 바퀴의 위치를 매개변수로 받아서
	 * 해당 위치의 바퀴를 교체하는 메서드
	 * @param location
	 */
	public void changeTire(int location) {
		switch (location) {
		case 1:
			// 다형성에 의해
			// 자식객체는 부모의 타입으로 자동 형변환 된다!!!!!!
			tireFR = new KumhoTire(tireFR.location,3);
			break;
		case 2:
			tireFL = new KumhoTire(tireFL.location,3);
			break;
		case 3:
			tireBR = new KumhoTire(tireBR.location,3);
			break;
		case 4:
			tireBL = new KumhoTire(tireBL.location,3);
			break;

		default:
			break;
		}
	}
}
