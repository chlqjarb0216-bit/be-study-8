package be_study.quiz.quiz49;

public class Food {
	String name;
	int price;
	int stock;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock < 0)
			return;
		this.stock = stock;
	}

	public String toString() {
		String s1 = "%s	%d원	".formatted(this.name, this.price);
		String s2 = "(품절)";
		if (this.stock > 0)
			s2 = "(남은수량 %d개)".formatted(this.stock);
		return s1 + s2;
	}

}
