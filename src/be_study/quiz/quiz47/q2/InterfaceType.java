package be_study.quiz.quiz47.q2;

public class InterfaceType {
	public static void main(String[] args) {
		// 객체 생성
		Orderable o1 = new Food("족발", 19800);
		Orderable o2 = new Electronics("에어팟", 199000);
		Orderable o3 = new Clothing("셔츠", 49900);
		Orderable[] oa = { o1, o2, o3 };
		// 총합 계산
		int sum = 0;
		for (Orderable o : oa) {
			sum += o.discountedPrice();
		}
		// 결과 출력
		System.out.printf("총합: %d원\n", sum);
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	@SuppressWarnings("unused")
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		return this.price * 9 / 10;
	}
}

class Electronics implements Orderable {
	@SuppressWarnings("unused")
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		return this.price * 8 / 10;
	}
}

class Clothing implements Orderable {
	@SuppressWarnings("unused")
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}

	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		// TODO Auto-generated method stub
		return this.price * 7 / 10;
	}
}