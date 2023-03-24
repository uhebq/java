package objectEx;

public class CalculatorMain {

	public static void main(String[] args) {
		
		// 타입 변수명 = new 타입()
		Calculator calc = new Calculator();
		int res = calc.add(5, 3);
		System.out.println("두수의 합 : " + res);
		
		Calculator calc2 = new Calculator();
		int res2 = calc2.minus(5, 3);
		System.out.println("두수의 차 : " + res2);
		
		Calculator calc3 = new Calculator();
		int res3 = calc3.multiple(5, 3);
		System.out.println("두수의 곱 : " + res3);
		
		Calculator calc4 = new Calculator();
		int res4 = calc4.division(5, 3);
		System.out.println("두수의 나누기 : " + res4);
		
		Calculator calc5 = new Calculator();
		int res5 = calc5.remain(5, 3);
		System.out.println("두수의 나눗셈의 나머지 : " + res5);

	}

}
