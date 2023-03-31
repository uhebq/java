package com.jungang;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
		
	}
	
	// 초기화
	public Employee(String name, int age, double height, double weight,
			int salary, String dept) {
		// 부모생성자는 첫번째 줄에서 호출
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public String information() {
		return super.information() + " " + getSalary() + " " + getDept();

}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
