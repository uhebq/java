package ifelse;

public class Random2 {
	public static void main(String[] args) {
		
		double num = Math.random();
		// 0~5.4456777765
		int numRes = (int) (Math.random()*6 + 1);
		System.out.println("주사위 : " + numRes);
		
		switch (numRes) {
		case 1:
			System.out.println("1번이 나왔습니다.");break;
		case 2:
			System.out.println("2번이 나왔습니다.");break;
		case 3:
			System.out.println("3번이 나왔습니다.");break;
		case 4:
			System.out.println("4번이 나왔습니다.");break;
		case 5:
			System.out.println("5번이 나왔습니다.");break;
		default :
			System.out.println("6번이 나왔습니다.");
		
		}
		
	}

}
