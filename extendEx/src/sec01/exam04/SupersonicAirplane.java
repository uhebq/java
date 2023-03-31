package sec01.exam04;

// 상속받을때 사용하는 키워드
// extend + 부모클래스명
public class SupersonicAirplane extends Airplane{
	
	// 상수
	// 한 번 정의 후 값을 변경할 수 없다.
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode;
	
	
	// 매개변수를 받아서 flyMode를 세팅
	public SupersonicAirplane(int flyMode) {
		// 부모생성자 호출
		// super();
		System.out.println("=====SupersonicAirplane 생성합니다.");
		if(flyMode == NORMAL || flyMode == SUPERSONIC){
			this.flyMode=flyMode;
		} else {
			flyMode = NORMAL;
		}
	}
	
	@Override
	public void fly() {
		// 부모가 가지고 있는 메서드를 자식클래스에서 재정의
		// 메서드를 재정의해도 기존에 부모가 가진 메서드를 호출할 수 있다.
		// super.메서드명();
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		} else {
			// fly()를 재작성했지만
			// 부모가 가지고 있는 fly()메서드를 호출할 수 있다.
			// super를 이용해서 접근
			super.fly();
		}
	}
	
	public void booster() {
		System.out.println("부스터 작동!!!!");
	}
}
