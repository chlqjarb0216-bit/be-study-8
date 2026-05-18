package be_study.quiz;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		/*
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)
		
		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30
		
		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20
		*/

		//		스캐너 선언
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		//		변수 선언부
		int numClass = 3;
		int numStudent = 5;
		int[][] scores = new int[numClass][numStudent];
		double[] avgs = new double[numClass];

		//		점수 입력
		for (int i = 0; i < numClass; i++) {
			System.out.print(i + 1 + "반 : ");
			for (int j = 0; j < numStudent; j++) {
				scores[i][j] = scanner.nextInt();
			}
		}

		//		평균 계산 및 출력
		double classAvgTotal = 0.;
		for (int i = 0; i < numClass; i++) {
			int sum = 0;
			for (int j = 0; j < numStudent; j++) {
				sum += scores[i][j];
			}
			avgs[i] = (double) sum / numStudent;
			classAvgTotal += avgs[i];
			System.out.println(i + 1 + "반 평균 : " + (int) avgs[i]);
		}
		System.out.println("전체 평균 : " + (int) (classAvgTotal / numClass));
	}

}
