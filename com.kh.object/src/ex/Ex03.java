package ex;

public class Ex03 {

	public static void main(String[] args) {
		int[] numbers = {5,3,4,2,1};
		// 배열의 중복 제거
		int lotteNum = 0;
		for (int num : numbers) {
			if(num == lotteNum) {
			}
		}
		// 배열의 값을 정렬하고 싶어요!
		// 방을 바꾸기 위해 새로운 변수를 선언하고 이용합니다.
		// 스트링의 인덱스도 0번부터 시작
		
		String str = "안녕하세요!!";
		
		System.out.println("char : " + str.charAt(lotteNum));
		
		// 문자열 끊기
		System.out.println(str.length());
		System.out.println(str.substring(0,2));
		System.out.println(str.substring(2,5));
		// 시작인덱스, 끝인덱스
		// 시작인덱스는 포함, 끝인덱스는 포함되지 않는다!
		System.out.println(str.substring(2,7));
		
	}

}
