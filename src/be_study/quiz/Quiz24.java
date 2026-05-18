package be_study.quiz;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int menu = 0;
		int cnt = 0;
		int[] cart = new int[3];
		String nextOrder = "y";
		String[] menus = { "아메리카노", "카페라떼", "바닐라라떼" };
		int[] prices = { 3500, 4100, 4300 };
		int totalPrice = 0;

		do {
			System.out.println("======== 메뉴 ========");
			for (int i = 0; i < menus.length; i++) {
				System.out.printf("%d. %s\t%d원\n", i + 1, menus[i], prices[i]);
			}
			System.out.println("====================");

			do {
				System.out.print("메뉴 선택 : ");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= menus.length) {
					break;
				} else {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				}
			} while (true);

			System.out.print("수량 선택 : ");
			cnt = scanner.nextInt();
			cart[menu - 1] += cnt;

			do {
				System.out.print("추가 주문하시겠습니까?(y/n) : ");
				nextOrder = scanner.next();
				if (nextOrder.equals("y") || nextOrder.equals("n")) {
					break;
				} else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
			} while (true);
		} while (nextOrder.equals("y"));

		System.out.println("====================");
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == 0) {
				continue;
			}
			int p = cart[i] * prices[i];
			totalPrice += p;
			System.out.printf("%s %d잔 : %d원\n", menus[i], cart[i], p);
		}
		System.out.println("====================");
		System.out.printf("총액 : %d원\n", totalPrice);
	}

}
