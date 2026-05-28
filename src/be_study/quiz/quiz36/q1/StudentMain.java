package be_study.quiz.quiz36.q1;

public class StudentMain {

	public static void main(String[] args) {
		//		Student s1 = new Student();
		//		s1.department = "Math";
		//		s1.studentNumber = 5006;
		//
		//		System.out.println(s1.department);
		//		System.out.println(s1.studentNumber);

		Student s2 = new Student();
		s2.setDepartment("Chemistry");
		s2.setStudentNumber(6589);

		System.out.println(s2.getDepartment());
		System.out.println(s2.getStudentNumber());
	}
}
