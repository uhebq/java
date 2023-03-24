package forEx;

public class NullPointerException {

	public static void main(String[] args) {
		// c초기값으로 null을 입력
		// 참조변수가 아무런 객체도 참조하고 있지 않다는 의미
		// . : 주소 접근자, 객체 접근 연산자
		// . 이후 객체가 가지고 있는 접근 가능한 필드, 메서드 목록을 보여준다.
		// 필드, 메소드
		// 변수이름.필드명;
		// 변수이름.메서드명(매개변수);
		String name = null;
		name = "안녕";
		// length() : 문자열의 총 길이를 반환
		// 해결방안 : ㅊ암조변수가 null인 경우 실행되지 않도록 처리한다.
		if(name != null) {
			System.out.println("총 문자수 : " + name.length());
		}
		
		System.out.println("정상적으로 종료되었습니다.");

	}

}
