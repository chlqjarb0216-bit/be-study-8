package be_study.quiz;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		/*
		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*****
		****
		***
		**
		*
		*/
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		*
		**
		***
		****
		*/
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		3. 입력된 수의 약수를 출력하시오.
		ex) 입력 : 6
		1 2 3 6
		 */
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		/*
		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		숫자를 입력받고 아래 문양으로 * 출력하기
		ex) 입력 : 5
		*
		**
		***
		****
		*****
		****
		***
		**
		*
		
		입력 : 3
		
		*
		**
		***
		**
		*
		*/
		int input4 = scanner.nextInt();
		for (int i = 1; i < 2 * input4; i++) {
			for (int j = 1; j <= (i <= input4 ? i : 2 * input4 - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		/*
		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		 */
		int sum5 = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sum5 += j;
			}
		}
		System.out.println(sum5);
		System.out.println();

		/*		
		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		*/
		int i = 1;
		int plus = 1;
		int sum6 = 0;
		for (i = 1; sum6 < 100; i++) {
			plus = -1 + 2 * (i % 2);
			sum6 += plus * i;
		}
		System.out.printf("+%d, sum: %d", i - 1, sum6);
	}

}
