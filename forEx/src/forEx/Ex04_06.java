package forEx;

public class Ex04_06 {
	public static void main(String[] args) {
		
		// i = 1,2,3,4
		for(int i=1; i<5; i++) {
			
			// j = 4,3,2,1
			for (int j=4; j>0 ;j--) {
				// i=1일때 j-1 = 3,2,1,0
				if(i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// 줄바꿈	
			System.out.println();
		}
	}

}
