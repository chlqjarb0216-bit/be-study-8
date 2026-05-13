package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		//		1.
		int evenOdd = scanner.nextInt();
		System.out.printf("%s\n", evenOdd % 2 == 0 ? "even" : "odd");

		//		2.
		int seven = scanner.nextInt();
		System.out.printf("%s\n", seven % 7 == 0 ? "7의 배수입니다" : "아닙니다");

		//		3.
		int sum1000 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 5 != 0) {
				continue;
			}
			sum1000 += i;
		}
		System.out.println(sum1000);

		//		4.
		System.out.print("입력 : ");
		int stars = scanner.nextInt();
		for (int i = 0; i < stars; i++) {
			System.out.print("*");
		}
		System.out.println();

		//		5.
		int sumOddMEven = 0;
		for (int i = 1; i <= 10; i++) {
			boolean isOdd = i % 2 == 1;
			sumOddMEven += i * (isOdd ? 1 : -1);
		}
		System.out.println(sumOddMEven);

		//		6.
		int number = 1;
		int sumNature = 0;
		while (sumNature <= 1000) {
			sumNature += number++;
		}
		System.out.println(sumNature);

		//		7.
		System.out.print("몇 단을 출력합니까 : ");
		int ninenine = scanner.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", ninenine, i, ninenine * i);
		}
	}

}
