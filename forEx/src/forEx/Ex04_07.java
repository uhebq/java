package forEx;

import java.util.Scanner;

public class Ex04_07 {
	public static void main(String[] args) {
		boolean run = true;
		
		// 입력을 받기위해 스캐너객체를 생성합니다.
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		
		Outter:
		while(run) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택> ");
			
			//scan.next() : 사용자의 입력을 문자열로 변환
			int input = scanner.nextInt(); // 사용자의 입력을 숫자로 반환
			
			// switch (변수) {
			// 		case 변수의 값 :
			// }
			switch (input) {
				case 1 :
					// 변수의 값이 1이면 실행
					// 코드 작성
					System.out.println("예금액> ");
					money += scanner.nextInt();
//					System.out.println("사용자입력값 : " + money);
					
					//break문이 없으면 다음 case를 계속해서 실행합니다.
					break;
				case 2 :
					System.out.println("출금액> ");
//					System.out.println("==출금 : " + money);
					int num = scanner.nextInt();
					if(money<num) {
						System.out.println("잔액이 부족합니다.");
					} else {
					money -= num; // money = money - num
					}
					break;
					
				case 3 :
					System.out.println("잔고> "+ money);
					break;
					
				case 4 :
					//System.exit(0);
					break Outter;
					
			
			
			}
			
//			if(input == 1) {
//				// 예금
//				
//			} else if(input == 2) {
//				// 출금
//			}
			
			
//			System.out.println("money : " + money);
		}
		System.out.println("프로그램 종료");
	}

}
