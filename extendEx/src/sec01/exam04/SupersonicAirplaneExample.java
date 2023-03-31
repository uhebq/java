package sec01.exam04;

public class SupersonicAirplaneExample {
	public SupersonicAirplaneExample() {
		
	}
	public static void main(String[] args) {
		SupersonicAirplane superSonic 
			= new SupersonicAirplane(SupersonicAirplane.NORMAL);
	// 이륙합니다.
	superSonic.takeOff();
	superSonic.fly();
	
	superSonic.flyMode = SupersonicAirplane.SUPERSONIC;
	superSonic.fly();
	
	superSonic.flyMode = SupersonicAirplane.NORMAL;
	superSonic.fly();
	
	// 착륙
	superSonic.land();
	
	}
}
