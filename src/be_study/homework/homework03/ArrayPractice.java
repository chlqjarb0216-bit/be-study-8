package be_study.homework.homework03;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr = ArrayPractice.q1_4_5();
		ArrayPractice.q2_3();
		ArrayPractice.q8(arr);
		for (int v : arr)
			System.out.print(v + " ");
		System.out.println();
		ArrayPractice.q10(arr);
		for (int v : arr)
			System.out.print(v + " ");
		System.out.println();
	}

	static int[] q1_4_5() {
		System.out.println("Q1");
		int[] numbers = { 1, 2, 6, 10, 53, -1, 0, -2 };
		for (int v : numbers)
			System.out.print(v + " ");
		System.out.println();
		System.out.println();

		//		q4
		System.out.println("Q4");
		int sum = 0;
		for (int v : numbers)
			sum += v;
		System.out.println(sum);
		System.out.println();

		//		q5
		System.out.println("Q5");
		for (int v : numbers)
			System.out.print(v + " ");
		System.out.println();
		System.out.println();

		return numbers;
	}

	static void q2_3() {
		int[] numbers = new int[5];
		numbers[2] = 50;

		//		q3
		System.out.println("Q3");
		System.out.println(numbers.length);
		System.out.println();
	}

	static double q6(int[] numbers) {
		int sum = 0;
		for (int v : numbers)
			sum += v;
		return (double) sum / numbers.length;
	}

	static int q7(int[] numbers) {
		int largest = numbers[0];
		for (int v : numbers) {
			if (v > largest)
				largest = v;
		}
		return largest;
	}

	static void q8(int[] numbers) {
		for (int i = 0; i < numbers.length; i++)
			numbers[i]++;
	}

	static int[] q9(int length) {
		return new int[length];
	}

	static void q10(int[] numbers) {
		for (int i = 0; i < numbers.length / 2; i++) {
			int tmp = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = numbers[i];
			numbers[i] = tmp;
		}
	}

}
