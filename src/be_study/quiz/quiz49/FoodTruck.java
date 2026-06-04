package be_study.quiz.quiz49;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {
	static Scanner s = new Scanner(System.in);
	ArrayList<Food> menuList = new ArrayList<>();
	int earning;

	void addMenu(Food f) {
		this.menuList.add(f);
	}

	void addMenu(Food f, int stock) {
		f.setStock(stock);
		this.menuList.add(f);
	}

	void setStock(int idx, int stock) {
		this.menuList.get(idx).setStock(stock);
	}

	void setStocks(int[] stocks) {
		if (this.menuList.size() != stocks.length)
			return;
		for (int i = 0; i < menuList.size(); i++) {
			setStock(i, stocks[i]);
		}
	}

	void addStocks(int[] stocks) {
		if (this.menuList.size() != stocks.length)
			return;
		for (int i = 0; i < menuList.size(); i++) {
			stocks[i] += menuList.get(i).getStock();
		}
		setStocks(stocks);
	}

	private Food scanOrder() {
		do {
			System.out.print("메뉴를 선택해주세요: ");
			int menuNum = s.nextInt();
			if (menuNum > 0 && menuNum <= this.menuList.size()) {
				return this.menuList.get(menuNum - 1);
			}
			System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
		} while (true);
	}

	public void main() {
		boolean isEnd = false;
		do {
			System.out.println();
			System.out.println("---------------- 메뉴선택 ----------------");
			System.out.println("1: 메뉴보기  2: 주문하기  3: 재고관리  4: 마감하기");
			System.out.print("입력: ");
			switch (s.nextInt()) {
			case 1: {
				showMenu();
				break;
			}
			case 2: {
				order();
				break;
			}
			case 3: {
				manage();
				break;
			}
			case 4: {
				endShop();
				isEnd = true;
				break;
			}
			default:
				System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
			}

		} while (!isEnd);
	}

	void showMenu() {
		System.out.println();
		System.out.println("======== 메뉴 ========");
		for (int i = 0; i < this.menuList.size(); i++) {
			Food m = this.menuList.get(i);
			System.out.printf("%d: %s\n", i + 1, m);
		}
		System.out.println("=====================");
	}

	void order() {
		showMenu();
		Food m = scanOrder();

		int orderCnt;
		do {
			System.out.print("주문하실 수량을 입력해주세요: ");
			int cnt = s.nextInt();
			if (cnt >= 0 && cnt <= m.getStock()) {
				orderCnt = cnt;
				break;
			}
			System.out.println("잘못된 수량입니다. 다시 입력해주세요.");
		} while (true);

		System.out.printf("%s %d개 주문하셨습니다. 총 %d원입니다.\n", m.name, orderCnt, m.price * orderCnt);
		m.setStock(m.getStock() - orderCnt);
		this.earning += m.price * orderCnt;
	}

	void manage() {
		System.out.println("재고 관리 메뉴입니다.");
		System.out.println("1: 특정 메뉴 재고 추가");
		System.out.println("2: 메뉴 일괄 재고 추가");
		System.out.println("3: 메뉴 추가");
		System.out.print("입력: ");
		switch (s.nextInt()) {
		case 1: {
			addStock();
			break;
		}
		case 2: {
			addStocks();
			break;
		}
		case 3: {
			manageAddMenu();
			break;
		}
		default: {
			System.out.println("잘못된 입력입니다.");
		}
		}
	}

	private int scanCnt() {
		while (true) {
			System.out.print("입고 수량을 입력해주세요: ");
			int cnt = s.nextInt();
			if (cnt >= 0) {
				return cnt;
			}
			System.out.println("잘못된 수량입니다. 다시 입력해주세요.");
		}
	}

	void addStock() {
		showMenu();
		Food m = scanOrder();

		int addCnt = scanCnt();

		System.out.printf("%s 재고를 %d개 추가합니다. %d -> ", m.name, addCnt, m.getStock());
		m.setStock(m.getStock() + addCnt);
		System.out.println(m.getStock());
	}

	void addStocks() {
		showMenu();
		System.out.println("입고할 수량을 순서대로 입력해주세요.");
		System.out.print("입력: ");
		int[] adds = new int[this.menuList.size()];
		for (int i = 0; i < adds.length; i++)
			adds[i] = s.nextInt();
		addStocks(adds);
		showMenu();
		System.out.println("입고를 완료했습니다.");
	}

	void manageAddMenu() {
		System.out.print("추가할 메뉴 이름: ");
		String name = s.next();
		int price;
		do {
			System.out.print("추가할 메뉴 가격: ");
			int p = s.nextInt();
			if (p >= 0) {
				price = p;
				break;
			}
			System.out.println("잘못된 가격입니다. 다시 입력해주세요.");
		} while (true);

		Food m = new Food(name, price);

		int addCnt = scanCnt();

		m.setStock(addCnt);
		this.menuList.add(m);
		System.out.printf("메뉴 %s 가격 %d원 수량 %d개 추가되었습니다.\n", m.name, m.price, m.getStock());
	}

	void endShop() {
		System.out.println("영업을 마감합니다.");
		System.out.printf("오늘 매출: %d원\n", this.earning);
		int sum = 0;
		for (Food m : this.menuList) {
			if (m.getStock() == 0)
				continue;
			System.out.printf("%s %d개 폐기 -> 손실: %d원\n", m.name, m.getStock(), m.price * m.getStock() * 3 / 10);
			sum += m.price * m.getStock() * 3 / 10;
		}
		if (sum == 0) {
			System.out.println("폐기물량이 없습니다! 완매를 축하합니다!");
		} else {
			System.out.printf("총 손실액: %d원\n", sum);
		}
		System.out.printf("최종수익: %d원\n", this.earning - sum);
	}
}
