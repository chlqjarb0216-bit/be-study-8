package be_study.quiz.quiz40;

public class Driver {
	String name;
	String company;
	boolean isDelivering;
	Order order;

	//	드라이버가 주문을 받을 수 있는지 체크
	public boolean getOrder(Order order) {
		this.order = order;
		this.isDelivering = true;
		return true;
	}

	//	배달완료
	public boolean completeDelivery() {
		this.order.completed();
		this.order = null;
		this.isDelivering = false;
		return true;
	}
}
