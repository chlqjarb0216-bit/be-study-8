package be_study.practice;

import be_study.myutil.InputScan;

public class Arr {
	//	1) 학생 5명의 점수를 배열에 저장하고 총점과 평균을 출력하시오.
	void sumAndAvg() {
		int[] scores = { 10, 30, 70, 30, 29 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double) sum / 5);
		System.out.println();
	}

	//	2) 배열에서 가장 큰 값과 가장 작은 값을 구하시오.
	void maxMin() {
		int[] arr = { 10, 30, 70, 30, 29 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		System.out.println();
	}

	//	3) 배열 안의 짝수 개수를 출력하시오.
	void cntEven() {
		int[] arr = { 10, 30, 70, 30, 29 };
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt + "개");
		System.out.println();
	}

	//	4) 배열 안의 모든 값을 역순으로 출력하시오.
	void reverse() {
		int[] arr = { 10, 30, 70, 30, 29 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - i - 1] + " ");
		}
		System.out.println();
		System.out.println();
	}

	//	5) 배열 안의 값 중 80점 이상만 출력하시오.
	void overValue() {
		int[] arr = { 10, 30, 70, 30, 29, 91 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 80) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}

	//	6) 배열의 모든 값을 2배로 변경하여 출력하시오.
	void mul2() {
		int[] arr = { 10, 30, 70, 30, 29, 91 };
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i] * 2;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println();
	}

	//	7) 사용자에게 10개의 숫자를 입력받아 합계를 구하시오.
	void sum() {
		InputScan.clear();
		System.out.print("10개의 숫자를 입력해주세요 : ");
		double[] arr = new double[10];
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = InputScan.SC.nextDouble();
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}

	//	8) 배열 안에서 특정 숫자가 몇 개 존재하는지 출력하시오.
	void cntSpecific() {
		int[] arr = { 10, 30, 70, 30, 29, 91 };
		int specific = 30;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == specific) {
				cnt++;
			}
		}
		System.out.printf("30이 %d개 있습니다.\n", cnt);
		System.out.println();
	}

	//	9) 배열의 평균보다 큰 값만 출력하시오.
	void cntOverAvg() {
		int[] arr = { 10, 30, 70, 30, 59 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > (double) sum / arr.length) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	//	10) 배열의 중복 값을 검사하여 출력하시오.
	void checkDuple() {
		int[] arr = { 10, 30, 70, 30, 59 };
		int[] set = new int[arr.length];
		int setCnt = 0;
		int[] duple = new int[arr.length];
		int dupleCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean isOnly = true;
			for (int j = 0; j < setCnt; j++) {
				if (arr[i] == set[j]) {
					isOnly = false;
				}
			}
			if (isOnly) {
				set[setCnt++] = arr[i];
			} else {
				isOnly = true;
				for (int j = 0; j < dupleCnt; j++) {
					if (arr[i] == duple[j]) {
						isOnly = false;
					}
				}
				if (isOnly) {
					duple[dupleCnt++] = arr[i];
				}
			}
		}
		if (dupleCnt > 0) {
			System.out.println("중복값");
			for (int i = 0; i < dupleCnt; i++) {
				System.out.print(duple[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		Arr arr = new Arr();

		arr.sumAndAvg();
		arr.maxMin();
		arr.cntEven();
		arr.reverse();
		arr.overValue();
		arr.mul2();
		//		arr.sum();
		arr.cntSpecific();
		arr.cntOverAvg();
		arr.checkDuple();
	}

}
