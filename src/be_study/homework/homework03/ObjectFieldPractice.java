package be_study.homework.homework03;

public class ObjectFieldPractice {

	public static void main(String[] args) {
		Person p = q11();
		q12();
		q13(p);
	}

	static Person q11() {
		System.out.println("Q11");
		Person p = new Person();
		p.name = "Jason";
		p.age = 20;
		System.out.println("이름: " + p.name);
		System.out.println("나이: " + p.age);

		return p;
	}

	static void q12() {
		System.out.println("Q12");
		Person p = new Person();
		p.hello();
	}

	static void q13(Person p) {
		System.out.println("Q13");
		System.out.println("이름: " + p.name);
	}

}
