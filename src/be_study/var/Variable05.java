package be_study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		System.out.println("println1");
		System.out.println("println2");
		String s1 = "txt test";
		System.out.println(s1);

		//		print
		System.out.print("print1");
		System.out.print("print2\n");

		System.out.println(); // 줄바꿈	<br>

		System.out.println("println3");

		int hour = 15;
		int minute = 2;

		//		현재 시각은 15시 2분 입니다.
		System.out.println("현재 시각은 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 시각은 %d시 %d분 입니다.", hour, minute);
		System.out.println("뭐");

		String menu = "갈비부리또";
		//		오늘 점심 메뉴는 ㅇㅇㅇ입니다.
		System.out.println("오늘 점심 메뉴는 " + menu + "입니다.");
		System.out.printf("오늘 점심 메뉴는 %s입니다.\n", menu);

		double rate = 3.4612;

		//		오늘 기준 이자율은 3.4612% 입니다.
		System.out.println("오늘 기준 이자율은 " + rate + "% 입니다.");
		System.out.printf("오늘 기준 이자율은 %f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %.2f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %10.4f%% 입니다.\n", rate);
		System.out.printf("오늘 기준 이자율은 %-10.4f%% 입니다.\n", rate);

		//		키보드로부터 입력 받기 Scanner
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		//		int 정수형	-> scanner.nextInt()
		//		double 실수형	-> scanner.nextDouble()
		//		String 문자열	-> scanner.nextLine()

		System.out.println("숫자를 입력하세요 : ");
		int number = scanner.nextInt(); // 정수형 입력 받아오기
		System.out.println("당신이 입력한 숫자는 " + number + "입니다.");
		System.out.printf("당신이 입력한 숫자는 %d입니다.\n", number);

		System.out.println("실수형 숫자를 입력하세요 : ");
		double number2 = scanner.nextDouble();
		System.out.printf("당신이 입력한 실수형 숫자는 %f입니다.\n", number2);
		System.out.printf("당신이 입력한 실수형 숫자는 %.3f입니다.\n", number2);

		scanner.nextLine(); // 청소용 (버퍼에 남아있는 찌꺼기 엔터 처리용. 하지만 엔터가 여러개 있다면?)

		System.out.println("문자열을 입력하세요 : ");
		String str = scanner.nextLine(); // 문자를 한라인 입력 (구분 기준 : 엔터 \n)
		System.out.println("입력한 문자열 : " + str);
		System.out.printf("입력한 문자열 : %s\n", str);
	}

}
