package package1;

import package2.C;

public class A {
	// 필드 정의
	
	// 기능 정의
	public void method1() {
		C c = new C(1);
		B b = new B();
//		c.method1();
//		c.methos2();
	}
}


class B {
	// default일 경우 같은 패키지에서 호출 가능
	B() {

	}
}