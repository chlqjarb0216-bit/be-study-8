package be_study.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		//		1.
		int num = 10;
		System.out.println(num != 0 ? (num > 0 ? "양수" : "음수") : "0");

		//		2.
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.printf("입력한 숫자=%d\n", num1);
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = scanner.nextInt();
		System.out.printf("입력한 숫자=%d\n\n", num2);

		System.out.printf("더하기 : %d+%d=%d\n", num1, num2, num1 + num2);
		System.out.printf("빼기 : %d-%d=%d\n", num1, num2, num1 - num2);
		System.out.printf("곱하기 : %d*%d=%d\n", num1, num2, num1 * num2);
		System.out.printf("나누기 : %d/%d=%f\n", num1, num2, (double) num1 / num2);
	}

}
