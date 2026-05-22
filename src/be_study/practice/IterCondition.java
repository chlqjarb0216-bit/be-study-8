package be_study.practice;

import be_study.myutil.InputScan;

public class IterCondition {

	public static void main(String[] args) {
		//		1) 1부터 100까지의 수 중 짝수의 합을 구하시오.
		int sumEven = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		System.out.println(sumEven);
		System.out.println();

		//		2) 정수 하나를 입력받아 홀수인지 짝수인지 출력하시오.
		InputScan.clear();
		System.out.print("정수 하나를 입력 : ");
		int n2 = InputScan.SC.nextInt();
		System.out.println(n2 % 2 == 0 ? "짝수" : "홀수");
		System.out.println();

		//		3) 두 정수를 입력받아 큰 수와 작은 수를 출력하시오.
		InputScan.clear();
		System.out.print("정수 두개를 입력 : ");
		int n3_1 = InputScan.SC.nextInt();
		int n3_2 = InputScan.SC.nextInt();

		int big = n3_1 > n3_2 ? n3_1 : n3_2;
		int small = n3_1 <= n3_2 ? n3_1 : n3_2;

		System.out.printf("큰수 : %d\n작은수 : %d\n", big, small);
		System.out.println();

		//		4) 1~100 사이에서 3의 배수이면서 5의 배수인 수를 모두 출력하시오.
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();

		//		5) 입력받은 숫자만큼 '*'을 출력하시오.
		InputScan.clear();
		System.out.print("양의 정수 하나를 입력 : ");
		int n5 = InputScan.SC.nextInt();
		for (int i = 0; i < n5; i++) {
			System.out.print("*");
		}
		System.out.println();

		//		6) 입력받은 수의 팩토리얼 값을 계산하시오.
		//		팩토리얼에 대한 설명 필요?
		InputScan.clear();
		System.out.print("양의 정수 하나를 입력 : ");
		int n6 = InputScan.SC.nextInt();
		int fac = 1;
		for (int i = 1; i <= n6; i++) {
			fac *= i;
		}
		System.out.println(fac);
		System.out.println();

		//		7) 구구단 2단~9단 전체를 출력하시오.
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\n", i, j, i * j);
			}
			System.out.println();
		}
		System.out.println();

		//		8) 1~100 중 소수를 모두 출력하시오.
		int[] primes = new int[50];
		int primeCnt = 0;
		for (int i = 2; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 0; j < primeCnt; j++) {
				if (i % primes[j] == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.println(i);
				primes[primeCnt++] = i;
			}
		}
		System.out.println();

		//		9) 두 주사위 눈의 합이 8이 되는 모든 경우를 출력하시오.
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 8) {
					System.out.printf("%d, %d\n", i, j);
				}
			}
		}
		System.out.println();

		//		10) 정수를 입력받아 양수/음수/0을 판별하시오.
		InputScan.clear();
		System.out.print("정수 하나를 입력 : ");
		int n10 = InputScan.SC.nextInt();
		System.out.println(n10 > 0 ? "양수" : (n10 < 10 ? "음수" : "0"));
		System.out.println();
	}

}
