package be_study.quiz.quiz31;

public class MonitorMain {

	public static void main(String[] args) {
		//		7.
		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.setColor("black");
		Monitor m2 = new Monitor("LG", 32, 330000);

		//		8.
		m1.setXY(1080, 780);
		m2.setColor("white");
		m2.setXY(4096, 2048);

		//		10.
		m1.printInfo();
		m2.printInfo();

		//		11.
		System.out.println(m2.addPrice(70000));

		//		12.
		m1.printInfo();
		m2.printInfo();
	}

}
