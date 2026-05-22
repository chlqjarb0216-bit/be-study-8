package be_study.practice;

import java.util.Random;

public class RandomAdv {
	//	1) 1~45 사이의 랜덤 숫자 6개를 생성하시오. (중복 불가)
	void random6() {
		Random random = new Random();

		int[] arr = new int[6];
		boolean isOnly = true;
		for (int i = 0; i < arr.length; i++) {
			int num;
			while (condition) {
				num = random.nextInt(1, 46);
				isOnly = true;
				for (int j = 0; j < i; j++) {
					if (num == arr[j]) {
						isOnly = false;
					}
				}
			}
			arr[i] = num;
			System.out.println(num);
		}
	}

	public static void main(String[] args) {

	}

}
