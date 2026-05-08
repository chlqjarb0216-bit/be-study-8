package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		//		1.
		int x1 = 10;
		int y1 = 4;
		//		1)
		int result1_1 = x1 / y1;
		System.out.println(result1_1);
		//		2)
		double result1_2 = (double) x1 / y1;
		System.out.println(result1_2);

		//		2.
		double a2 = 3.5;
		double b2 = 4.7;
		double result2 = a2 + (int) b2;
		System.out.println(result2);

		//		3.
		String a3 = "3.4";
		String b3 = "4";
		int result3 = (int) Double.parseDouble(a3) * Integer.parseInt(b3);
		System.out.println(result3);

		//		4.
		String a4 = "10";
		int b4 = 3;
		double c4 = 4.5;
		String result4 = a4 + String.valueOf((int) (b4 * c4));
		System.out.println(result4);

		//		5.
		int a5 = 4;
		double b5 = 3.4;
		String c5 = "6.8";
		String result5 = String.valueOf((int) (Double.parseDouble(c5) / b5)) + a5 + (int) b5;
		System.out.println(result5);

		//		6.
		int x6 = 111;
		int y6 = 13;
		//		1)
		int result6_1 = x6 % y6;
		System.out.println(result6_1);
		//		2)
		int result6_2 = x6 / y6;
		System.out.println(result6_2);
	}

}
