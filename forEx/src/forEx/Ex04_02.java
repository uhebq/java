package forEx;

public class Ex04_02 {
	public static void main(String[] args) {
		// 1~100까지 정수 중 3의 배수의 총합
		int sum=0;
		for(int i=1; i<101;i++) {
			//System.out.println("i=" + i);
			// 3의 배수인지 판단!!
			// != 아니면 (!부정연산자)
			// == 같으면 != 같지 않으면
			if(i%3 != 0) {
				// 3의 배수가 아니면 증감식으로 이동
				// break : 반복문 탈출
				// continue : 증감식으로 이동해
				// continue 이후 명령문장을 실행하지 않고 증감식으로 이동
				continue;
			}
			// 3의 배수만 넘어올 수 있다
			sum += i;
		} // for 종료
		System.out.println(sum);
	}

}
