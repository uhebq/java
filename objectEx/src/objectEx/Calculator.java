package objectEx;

public class Calculator {
	
		// 메서드를 만드는 방법
		// 메서드 : 객체의 기능을 정의
		// 접근제한자 반환타입 메서드명(매개변수타입 변수명){}
		
		/** 두개의 정수를 받아서 두수의 합을 반환합니다.
		 * @return 두수의 합
		 * 
		 */
		public int add(int num1, int num2) {
			
			return num1 + num2;
			
		}

		/** 두개의 정수를 받아서 두수의 차이를 반환합니다.
		 * 
		 * @param num1
		 * @param num2
		 * @return 두수의 차
		 */
		public int minus(int num1, int num2) {
			
			return num1 - num2;
			
		}
		
		/** 두개의 정수를 받아서 두수의 곱을 반환합니다.
		 * 
		 * @return 두수의 곱
		 */
		public int multiple(int num1, int num2) {
			
			return num1 * num2;
			
		}
		
		/** 두개의 정수를 받아서 나눗셈을 한 값을 반환합니다.
		 * 
		 * @param num1
		 * @param num2
		 * @return num1을 num2로 나눈 값
		 */
		
		public int division(int num1, int num2) {
			
			return num1 / num2;
			
		}
		
		
		/** 두개의 정수를 받아서 나눈 나머지 값을 반환합니다.
		 * 
		 * @param num1
		 * @param num2
		 * @return num1을 num2로 나눈 나머지 값
		 */
		
		public int remain(int num1, int num2) {
			
			return num1 % num2;
			
		}


}
