package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//		1.
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("밑변의 길이를 입력해주세요 : ");
		double width = scanner.nextDouble();
		System.out.print("높이를 입력해주세요 : ");
		double height = scanner.nextDouble();

		System.out.printf("입력된 삼각형의 넓이 : %f\n", width * height / 2);

		//		2.
		System.out.print("밑변의 길이를 입력해주세요 : ");
		double bottom = scanner.nextDouble();
		System.out.print("윗변의 길이를 입력해주세요 : ");
		double top = scanner.nextDouble();
		System.out.print("높이를 입력해주세요 : ");
		double trapeHeight = scanner.nextDouble();

		System.out.printf("입력된 사다리꼴의 넓이 : %f\n", (top + bottom) * trapeHeight / 2);

		//		3.
		int numStudent = 24;
		int amountSnack = 100;
		System.out.printf("%d명의 학생에게 %d개의 과자를 나누어 주면 인당 %d개의 과자를 받고 %d개의 과자가 남습니다.\n", numStudent, amountSnack,
				amountSnack / numStudent, amountSnack % numStudent);

		//		4.
		System.out.print("세자리 정수를 입력해주세요 : ");
		int number = scanner.nextInt();

		System.out.printf("백의자리 : %d\n", number / 100);
		System.out.printf("십의자리 : %d\n", number % 100 / 10);
		System.out.printf("일의자리 : %d\n", number % 10);

		//		5.
		int x = 10;
		int y = 20;
		System.out.println("x=" + x + " y=" + y);
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("x=" + x + " y=" + y);
	}

}
