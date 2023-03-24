package forEx;

public class Gugudan {

	public static void main(String[] args) {
		// 중첩(이중)반복문을 이용하여 구구단 출력하기
		// for(초기식;조건식;증감식;)
		// i를 1~9까지 출력해봅시다
		
		// 2 ~ 9
		// Outter :
		for (int dan = 2; dan<10; dan++) {
			
			System.out.println(dan+"단");
			//for 시작
			// i : 1 ~ 9
			for(int i=1; i<10; i++) {
				// 만약 6단이면 구구단을 출력하지마
				// if(dan==6) {
				//	 lable의 위치까지 반복문을 탈출합니다.
				//	 break Outter;				
				//	 }
				//System.out.println("i=" + i);
				//System.out.println(dan + "*" + i + "=" + dan * i);
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
			}
			// for 종료
			System.out.println();
//			6단에서 구구단을 멈춰!			
//			if(dan==6) {
//				break;
//			}

		} // for 종료
		
		// 1~10까지의 수중에서 짝수의 합을 구해봅시다
		System.out.println("====== 짝수의 합 구하기 ======");
		int sum = 0;
		for(int i=1; i<11; i++) {
			// System.out.println("i="+i);
			// 홀수이면 증감식으로 넘어갑니다!
			// % : 나머지 연산자
			// 2로 나눈 나머지가 1이면 홀수 0이면 짝수
			if(i%2==1) { // 홀수이면
				continue; // 증감식으로 이동해!!
			}
			// System.out.println("i="+i);
			sum += i; // sum = sum + i

		}
		System.out.println("짝수의 합계 : " + sum);

	} // main 코드블럭 종료

}
