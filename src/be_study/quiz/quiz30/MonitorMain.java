package be_study.quiz.quiz30;

public class MonitorMain {

	public static void main(String[] args) {
		Monitor m1 = new Monitor(65, "삼성", "더프레임");
		Monitor m2 = new Monitor(80, "LG", "올레드");

		m1.printInfo();
		m2.printInfo();
	}

}
