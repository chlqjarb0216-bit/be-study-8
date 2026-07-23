package be_study.quiz.quiz52;

public class Product {

	int p_code = -1;
	String p_name;
	int p_price = -1;

	public Product() {
	}

	public Product(int p_code, String p_name, int p_price) {
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_price = p_price;
	}

	public int getP_code() {
		return p_code;
	}

	public void setP_code(int p_code) {
		this.p_code = p_code;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	@Override
	public String toString() {
		return "Product [p_code=" + p_code + ", p_name=" + p_name + ", p_price=" + p_price + "]";
	}

}
