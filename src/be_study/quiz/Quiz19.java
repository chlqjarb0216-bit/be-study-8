package be_study.quiz;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		//		플래그
		boolean isShutdown = false;
		//		일단 메뉴를 출력
		do {
			//			메뉴 출력부
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");

			//			입력부
			System.out.print("메뉴 번호를 입력하세요 : ");
			int menu = scanner.nextInt();

			//			입력 검증 및 출력 로직
			switch (menu) {
			case 1:
				System.out.println("입력 메뉴입니다.");
				break;
			case 2:
				System.out.println("수정 메뉴입니다.");
				break;
			case 3:
				System.out.println("조회 메뉴입니다.");
				break;
			case 4:
				System.out.println("삭제 메뉴입니다.");
				break;
			case 5:
				System.out.println("프로그램이 종료됩니다.");
				isShutdown = true;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			//			menu != 5
			//			변수 하나는 줄어들지만 조건 판별에 연산 하나가 더 들어감
		} while (!isShutdown);
	}

}
