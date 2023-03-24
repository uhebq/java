package getter.setter;

import java.util.Calendar;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person("123456", "홍길동");
		// 상수 필드의 값을 변경할 수 있다.
		// p.nation = "한국"; <-- final로 지정되어 있는 필드이기 때문에 변경시 오류발생
		p.name = "홍사원";
		
		System.out.println("파이값 : " + Person.PI);
		System.out.println("지구반지름 : " + Person.EARTH_RADIUS + "km");
		
		Calendar cal = Calendar.getInstance();
		
		// 현재 일을 출력
		int day = cal.get(Calendar.DATE);
		int day1 = cal.get(5);
		
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.DATE) + "일");
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) + "시");
		System.out.println(cal.get(Calendar.MINUTE) + "분");
		System.out.println(cal.get(Calendar.SECOND) + "초");
		
		// 실행전
		long before = System.currentTimeMillis();
		long after = System.currentTimeMillis();

	}

}
