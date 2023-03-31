package sec01.exam02;

// 자식클래스에서 부모클래스를 정의한다.
// 자식이 부모를 선택
public class Student extends People {
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		// 부모의 생성자를 호출
		// super("시스타","123456");
		// 매개변수로 입력된 값을 받아서 부모생성자를 호출합니다.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public String toString() {
		return name + "/" + ssn + "/" + studentNo;
	}

}
