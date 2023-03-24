package arrayEx;

// 접근제어자 class 클래스명 {}
public class ArrayEx5 {
	// 접근제어자 반환타입 메서드명(매개변수){}
	// void : 반환 타입이 없다는 의미
	// 매개변수 : (타입 변수명)
	// 매개변수 : 있을수도 있고 없을수도 있다
	// 매개수가 있다면 타입을 명시해줘야 한다!
	public static void main(String[] args) {
		
		// System.out.println(args.length);
		
		// System.out.println(args[0]);
		// 아무것도 만들지 않으면 방이 생성되지 않는다.
		// 따라서 오류가 발생
		
		// 1: 로컬, 2: 테스트, 3: 운영
		int mode = Integer.parseInt(args[0]);
		if (mode ==1) {
			System.out.println("로컬 환경입니다.");
		} else if(mode ==2) {
			System.out.println("테스트 환경입니다.");
		} else if(mode ==3) {
			System.out.println("운영 환경입니다.");
		}
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
			
		}
	}

}
