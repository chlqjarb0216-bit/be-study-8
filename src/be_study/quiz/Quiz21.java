package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		/*
		1.
		2x + 4y = 10 이 만족하는
		모든 x, y 쌍을 구하시오.
		(x와 y는 자연수 1~10)
		 */
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}

		/*
		2.
		정수 2개를 입력 받아서,
		아래 계산 결과를 출력하시오.
		큰수 - 작은수
		*/
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		if (int1 > int2) {
			System.out.println(int1 - int2);
		} else {
			System.out.println(int2 - int1);
		}

		/*
		3.
		윷놀이 게임
		4개의 윷을 입력받고 결과를 출력하시오.
		(뒷도는 없습니다!)
		0 : 안 뒤집어진 상태
		1 : 뒤집어진 상태
		ex) 입력 0 0 1 0
		결과 도
		입력 0 1 0 1
		결과 개
		 */
		int[] sticks = new int[4];
		int sumSticks = 0;
		for (int i = 0; i < sticks.length; i++) {
			sticks[i] = scanner.nextInt();
			sumSticks += sticks[i];
		}
		switch (sumSticks) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		}

		/*
		4. 입력받은 수 만큼 별 출력하기
		ex) 4
		****
		5
		*****
		*/
		int cnt = scanner.nextInt();
		for (int i = 0; i < cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
