package ifelse;

public class Random {

	public static void main(String[] args) {
		
		// Math.random()
		// 0.0~ 1.0 사이의 무작위 수를 추출해 double 타입으로 변환
		// 0.0000000....1 ~ 0.99999999...9
		
		double rotto1 = Math.random();
		double rotto2 = Math.random();
		double rotto3 = Math.random();
		double rotto4 = Math.random();
		double rotto5 = Math.random();

		System.out.println(rotto1);
		System.out.println(rotto2);
		System.out.println(rotto3);
		System.out.println(rotto4);
		System.out.println(rotto5);
		
		double dice = (int) (Math.random()*6 + 1);
		
		if(dice==1) {
			System.out.println("1번이 나왔습니다.");
		} else if(dice==2) {
			System.out.println("2번이 나왔습니다.");
		} else if(dice==3) {
			System.out.println("3번이 나왔습니다.");
		} else if(dice==4) {
			System.out.println("4번이 나왔습니다.");
		} else if(dice==5) {
			System.out.println("5번이 나왔습니다.");
		} else { System.out.println("6번이 나왔습니다.");
		}
		
		System.out.println(dice);
		
		
	}

}

