package be_study.quiz.quiz36.q2;

public class SalaryMan {
	int salary;

	SalaryMan() {
		this.salary = 1000000;
	}

	SalaryMan(int salary) {
		this.salary = salary;
	}

	int getAnnualGross() {
		return this.salary * (12 + 5);
	}
}
