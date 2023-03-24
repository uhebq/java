package getter.setter;

public class Person {
	
	public static final double PI = 3.14159;
	public static final double EARTH_RADIUS = 6400;
	
	
	// 상수 : 한번 값이 정해지고 나면 수정이 불가능
	final String nation = "korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
		// 상수는 값을 변경하는 것이 불가능!!!
		// this.ssn = "123456-1234567";
		this.name = "정찬우";
	}
}
