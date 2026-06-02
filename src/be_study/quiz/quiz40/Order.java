package be_study.quiz.quiz40;

import java.util.ArrayList;

public class Order {
	int orderNum;
	//	주문받은 메뉴를 리스트로 관리하여 한 번에 여러 메뉴 주문이 들어온 경우를 대응하고 추가 주문에 대응함.
	ArrayList<Pizza> orderMenuList;
	Customer customer;
	//	주문의 현재 상태를 세분화
	OrderState state;

	//	피자 하나만 주문할 때만 새 메뉴리스트를 생성하는 것으로 비용을 절감?
	Order(Customer customer, int num, Pizza pizza) {
		this.customer = customer;
		this.orderNum = num;
		this.orderMenuList = new ArrayList<>();
		this.orderMenuList.add(pizza);
		this.state = OrderState.ORDERED;
	}

	Order(Customer customer, int num, ArrayList<Pizza> pizzas) {
		this.customer = customer;
		this.orderNum = num;
		this.orderMenuList = pizzas;
		this.state = OrderState.ORDERED;
	}

	//	주문 상태 갱신 함수
	public void ready() {
		this.state = OrderState.READY;
	}

	public void orderDelivery() {
		this.state = OrderState.DELIVERING;
	}

	public void completed() {
		this.state = OrderState.COMPLETE;
	}
}
