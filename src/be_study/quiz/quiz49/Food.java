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

}
