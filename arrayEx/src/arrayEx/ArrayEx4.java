package arrayEx;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 스트링 타입의 배열 5칸을 만들기
		// 첫번째칸에 이름 입력하기
		String[] names = new String[5];
		names[0] = "홍길동";
		
		System.out.println("names 배열의 메모리 주소 : ");
		System.out.println(names);
		
		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법
		System.out.println("names 객체의 hashCode : " + names.hashCode());
		// names.hashCode();
		// 16진수로 표시
		System.out.println("16진수로 변환 : "
							+ Integer.toHexString(names.hashCode()));
		

	}

}
