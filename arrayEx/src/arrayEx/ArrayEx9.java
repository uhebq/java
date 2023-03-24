package arrayEx;

public class ArrayEx9 {

	public static void main(String[] args) {
		String[] names = new String[3];
//		names[0] = "Java";
//		names[1] = "Java";
//		names[2] = "C#";
		
		names[0] = new String("Java");
		names[1] = new String("Java");
		names[2] = "C#";
		
		if(names[0] == names[1]) {
			System.out.println("0번방 == 1번방");
		} else {
			System.out.println("0번방 != 1번방");
		}
		

	}

}
