package be_study.db.v3;

import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {

		ProfessorDAO professorDAO = new ProfessorDAO();

		List<ProfessorDTO> professorList = professorDAO.findProffesorList();

		for (ProfessorDTO professorDTO : professorList) {
			//System.out.println(professorDTO.toString());
			// yyyy-MM-dd
			//String hiredate = ConvertDateUtil.convertLocalDateTimeToString(professorDTO.getHiredate());

			System.out.println(professorDTO.toString());
			System.out.println(professorDTO.getHiredate());

			//ConvertDateUtil.convertDateStringToLocalDateTime(professorDTO.getHiredate());
		}

		//		날짜 데이터 값 저장
		ProfessorDTO p1 = new ProfessorDTO();
		p1.setProfno(9002);
		p1.setName("name2");
		p1.setId("idp2");
		p1.setHiredate("1999-09-30");

		int result1 = professorDAO.saveProfessor(p1);
		if (result1 > 0) {
			System.out.println("정상 저장 성공");
		}

	}

}
