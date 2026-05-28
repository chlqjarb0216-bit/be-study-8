package be_study.inherit.inherit01;

public class Child extends Parent { // extends 상속받을부모클래스
	String school;
	int grade;

	Child() {
		//		부모에 기본생성자가 없으면, 직접 부모생성자 호출
		super(0);
		System.out.println("Child() 생성자 호출됨");
	}

	Child(String school, int grade) {
		super(0); // 부모생성자 먼저 호출...
		//		그 다음에 자식객체 생성자에서 할일 코드들...
		this.school = school;
		this.grade = grade;
	}

	Child(String school, int grade, int money) {
		super(money);
		this.school = school;
		this.grade = grade;
	}

	void play() {
		System.out.println("나가서 뛰어 놀기.");
	}

	void printInfo() {
		System.out.println(this.school + " " + this.grade + " " + this.money);
		System.out.println(age); // GrandParent
	}
}
