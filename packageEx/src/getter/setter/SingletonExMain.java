package getter.setter;

public class SingletonExMain {
	public static void main(String[] args) {
		SingletonEx ex = SingletonEx.getInstance();
		SingletonEx ex1 = SingletonEx.getInstance();
		SingletonEx ex2 = SingletonEx.getInstance();
		SingletonEx ex3 = SingletonEx.getInstance();
		SingletonEx ex4 = SingletonEx.getInstance();
		
		if(ex == ex1) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}

	}

}
