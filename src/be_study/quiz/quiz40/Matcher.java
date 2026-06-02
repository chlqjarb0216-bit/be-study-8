package be_study.quiz.quiz40;

import java.util.ArrayList;

public class Matcher {
	//	주문과 완료된 주문, 드라이버와 매칭결과를 리스트로 관리
	ArrayList<Order> currentOrder;
	ArrayList<Order> completedOrder;
	ArrayList<Driver> drivers;
	ArrayList<MatchingResult> results;

	//	매칭 프로그램이 오더 기능을 겸하고 있기에 주문번호 역할을 하는 변수를 정적으로 관리
	static int orderCnt;

	public boolean makeOrder(Customer customer, Pizza pizza) {
		this.currentOrder.add(new Order(customer, Matcher.orderCnt++, pizza));
		return true;
	}

	public boolean makeOrder(Customer customer, ArrayList<Pizza> pizzas) {
		this.currentOrder.add(new Order(customer, Matcher.orderCnt++, pizzas));
		return true;
	}

	//	준비된 오더에 대하여 배달중이지 않은 드라이버 중 현재 배달 가능한 드라이버를 골라 매칭
	public MatchingResult match(Order order) {
		for (Driver driver : drivers) {
			if (!driver.isDelivering) {
				if (driver.getOrder(order)) {
					MatchingResult result = MatchingResult.success(order, driver);
					order.orderDelivery();
					this.results.add(result);
					return result;
				}
			}
		}
		MatchingResult result = MatchingResult.fail(order);
		this.results.add(result);
		return result;
	}
}
