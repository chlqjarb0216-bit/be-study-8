package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		//		1.
		//		자연수 5개를 입력 받는다.
		System.out.print("자연수 5개를 입력해주세요 : ");
		int[] nNums = new int[5];
		for (int i = 0; i < 5; i++) {
			int tmp = scanner.nextInt();
			nNums[i] = tmp;
		}
		//		출력할 숫자를 선택
		System.out.print("몇번째 수인가요? ");
		//		출력
		System.out.printf("결과 : %d\n", nNums[scanner.nextInt() - 1]);

		//		2.
		//		자연수 5개를 입력
		System.out.print("자연수 5개를 입력해주세요 : ");
		int[] nNums2 = new int[5];
		for (int i = 0; i < 5; i++) {
			int tmp = scanner.nextInt();
			nNums2[i] = tmp;
		}
		//		거꾸로 출력
		System.out.print("결과 : ");
		for (int i = 4; i >= 0; i--) {
			System.out.printf("%d ", nNums2[i]);
		}
		System.out.println();

		//		3.
		//		4x4 배열 생성
		int[][] square = new int[4][4];
		//		값을 할당
		/*
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				square[i][j] = i * 4 + j + 1;
			}
		}
		*/
		for (int i = 0, n = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				square[i][j] = ++n;
			}
		}
		//		출력
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%-3d ", square[i][j]);
			}
			System.out.println();
		}
	}

}
