package be_study.quiz;

public class Quiz26 {

	public static void main(String[] args) {

		/*
		1.
		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		*/
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				//				두 눈의 합이 6일때
				if (i + j == 6) {
					System.out.println(i + ", " + j);
				}
			}
		}
		System.out.println();

		/*
		2.
		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
		1) Math.random() 활용
		2) int[] lotto = new int[6]; 활용
		*/
		//		로또통
		int[] pool = new int[45];
		int[] lotto = new int[6];

		//		로또통 초기화
		for (int i = 0; i < pool.length; i++) {
			pool[i] = i + 1;
		}

		for (int i = 0; i < lotto.length; i++) {
			//			로또통의 몇번째
			int index = (int) (Math.random() * (pool.length - i));
			lotto[i] = pool[index];
			//			로또통에서 나온 숫자 제거(앞으로 당기기)
			for (int j = 0; j < pool.length - i - 1; j++) {
				if (j < index) {
					continue;
				}
				pool[j] = pool[j + 1];
			}
		}

		//		출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println();

		/*
		3.
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
		//		Quiz25 참조

		/*
		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
		
		ex)
		int[][] arr =
		{
		{10, 20, 30},
		{20, 30, 40},
		{30, 40, 50}
		};
		이 주어지는 경우 최종 결과는
		10 20 30 60
		20 30 40 90
		30 40 50 120
		60 90 120 270
		*/
		int[][] arr = { { 10, 20, 30 }, { 20, 30, 40 }, { 30, 40, 50 } };

		//		주어진 배열의 행과 열
		int row = arr.length;
		int column = arr[0].length;

		//		결과 배열
		int[][] resArray = new int[row + 1][column + 1];
		//		각 열의 합
		int[] sumColumn = new int[column + 1];

		for (int i = 0; i < resArray.length; i++) {
			//			행의 합
			int sumRow = 0;

			for (int j = 0; j < column; j++) {
				//				마지막 행이 아닐 때 주어진 배열을 복사
				//				마지막 행일 때 각 열의 합을 대입
				if (i < row) {
					int v = arr[i][j];
					resArray[i][j] = v;
					sumRow += v;
					sumColumn[j] += v;
				} else {
					resArray[i][j] = sumColumn[j];
				}
			}
			//			마지막 열 처리
			resArray[i][column] = i < row ? sumRow : sumColumn[column];
			sumColumn[column] += sumRow;

		}

		//		출력
		for (int i = 0; i < resArray.length; i++) {
			for (int j = 0; j < resArray[i].length; j++) {
				System.out.printf("%4d ", resArray[i][j]);
			}
			System.out.println();
		}
	}

}
