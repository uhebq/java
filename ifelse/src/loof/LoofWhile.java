package loof;

public class LoofWhile {
	public static void main(String[] args) {
		int i=0, sum=0; 
		
		while (i<=100) {
//			System.out.println(i);
			sum = sum + i;
			i=i+1;
//			System.out.println(i=i+1);
		}
		System.out.println("while문의 합 : " + sum);
	}

}
