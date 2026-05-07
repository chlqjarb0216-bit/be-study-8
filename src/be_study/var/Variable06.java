package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = 10;

		//		기본 타입 값이 같은가? 비교하는 연산자 ==
		//		== 비교 -> 결과 -> 논리형 (true/false)

		boolean b1 = num1 == num2; // (true/false)
		System.out.println(b1);

		scanner.nextLine(); // 엔터 청소용

		String str1 = scanner.nextLine();
		String str2 = "커피";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);

		//		문자열(String) 값 비교할 때는 == 으로 할 수 없음. -> .equals() 기능(메소드) 사용

		//		문자열.equals(문자열)
		System.out.println(str1.equals(str2)); // 똑같은 값 입력시 true
		System.out.println(str2.equals(str1)); // 똑같은 값 입력시 true

		System.out.println(str1 == "커피");
		System.out.println(str1.equals("커피"));
	}

}
