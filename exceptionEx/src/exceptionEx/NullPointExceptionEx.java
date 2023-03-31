package exceptionEx;

public class NullPointExceptionEx {

	public static void main(String[] args) {
		String str = null;
		
		// 참조변수가 null 값을 가지고 있을때
		// 참조변수로부터 객체접근연산자(.)을 이용해서 접근할때 발생하는 오류
		try {
			str.toString();
			print(str);
		} catch (Exception e) {
			System.out.println("오류가 발생하였습니다.");
		}
	}
	public static void print(String str) {
		System.out.println(str.toString());
	}
}
