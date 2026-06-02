package be_study.quiz.quiz40;

// 배달매칭 결과
public class MatchingResult {
	Order order;
	Driver driver;
	boolean result;

	private MatchingResult(Order order, Driver driver) {
		this.order = order;
		this.driver = driver;
		this.result = true;
	}

	private MatchingResult(Order order) {
		this.order = order;
		this.result = false;
	}

	public static MatchingResult success(Order order, Driver driver) {
		return new MatchingResult(order, driver);
	}

	public static MatchingResult fail(Order order) {
		return new MatchingResult(order);
	}
}
