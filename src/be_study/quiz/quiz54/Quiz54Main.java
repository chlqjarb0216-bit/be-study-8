package be_study.quiz.quiz54;

import java.util.List;

public class Quiz54Main {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();

		//		1. 기본 student 전체 조회 메소드
		System.out.println("----------1. 기본 student 전체 조회 메소드-----------");
		List<StudentDTO> result1 = studentDAO.findStudnetList();
		for (StudentDTO studentDTO : result1) {
			System.out.println(studentDTO);
		}

		//		2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
		System.out.println("----------2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드-----------");
		List<StudentDTO> result2 = studentDAO.findStudnetList(1);
		for (StudentDTO studentDTO : result2) {
			System.out.println(studentDTO);
		}

		//		3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
		System.out.println("----------3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드-----------");
		StudentDTO input3 = new StudentDTO();
		input3.setStudno(9876);
		input3.setName("name3");
		input3.setId("id3");
		input3.setGrade(3);
		input3.setJumin("0005313333333");
		input3.setBirthday("2000-05-31");
		input3.setTel("02) 333-3333");
		input3.setHeight(173);
		input3.setWeight(73);
		input3.setDeptno1(103);
		input3.setDeptno2(203);
		input3.setProfno(3003);
		int result3 = studentDAO.saveStudent(input3);
		if (result3 > 0) {
			System.out.println("정상 저장 완료");
		}

		System.out.println("----------저장 확인-----------");
		List<StudentDTO> result3L = studentDAO.findStudnetList(3);
		for (StudentDTO studentDTO : result3L) {
			System.out.println(studentDTO);
		}

		//		3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
		System.out.println("---------null저장-----------");
		StudentDTO input4 = new StudentDTO();
		input4.setStudno(7787);
		input4.setName("name4");
		input4.setId("id4");
		input4.setGrade(4);
		input4.setJumin("0005314444444");
		input4.setBirthday("2000-05-31");
		input4.setTel("02) 444-4444");
		input4.setHeight(174);
		input4.setWeight(74);
		input4.setDeptno1(104);
		input4.setDeptno2(null);
		input4.setProfno(4004);
		int result4 = studentDAO.saveStudent(input4);
		if (result4 > 0) {
			System.out.println("정상 저장 완료");
		}

		System.out.println("----------저장 확인-----------");
		List<StudentDTO> result4L = studentDAO.findStudnetList(4);
		for (StudentDTO studentDTO : result4L) {
			System.out.println(studentDTO);
		}

	}

}
