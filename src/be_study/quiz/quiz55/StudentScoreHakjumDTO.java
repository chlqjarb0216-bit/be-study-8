package be_study.quiz.quiz55;

public class StudentScoreHakjumDTO {
	int studno;
	String name;
	int score;
	String grade;

	public StudentScoreHakjumDTO() {
	}

	public StudentScoreHakjumDTO(int studno, String name, int score, String grade) {
		this.studno = studno;
		this.name = name;
		this.score = score;
		this.grade = grade;
	}

	public int getStudno() {
		return studno;
	}

	public void setStudno(int studno) {
		this.studno = studno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "StudentScoreHakjumDTO [studno=" + studno + ", name=" + name + ", score=" + score + ", grade=" + grade
				+ "]";
	}
}
