package be_study.db.v3;

import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {

		ProfessorDAO professorDAO = new ProfessorDAO();

		List<ProfessorDTO> professorList = professorDAO.findProffesorList();

		for (ProfessorDTO professorDTO : professorList) {
			//System.out.println(professorDTO.toString());
			// yyyy-MM-dd
			String hiredate = ConvertDateUtil.convertLocalDateTimeToString(professorDTO.getHiredate());
			System.out.println(hiredate);
		}

	}

}
