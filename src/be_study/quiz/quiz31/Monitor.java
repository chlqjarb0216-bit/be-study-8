package be_study.quiz.quiz31;

//1.
public class Monitor {
	//	2.
	String productor;
	int inch;
	int price;
	String color;
	int maxPixelX;
	int maxPixelY;

	//	3.
	Monitor(String productor, int inch, int price) {
		this.productor = productor;
		this.inch = inch;
		this.price = price;
	}

	//	4.
	void setColor(String color) {
		this.color = color;
	}

	void setXY(int x, int y) {
		this.maxPixelX = x;
		this.maxPixelY = y;
	}

	//	5.
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}

	//	6.
	int addPrice(int add) {
		this.price += add;
		return this.price;
	}

	//	9.
	void printInfo() {
		System.out.println("제조사	: " + this.productor);
		System.out.println("인치수	: " + this.inch);
		System.out.println("가격	: " + this.price);
		System.out.println("색상	: " + this.color);
		System.out.println("최대픽셀X	: " + this.maxPixelX);
		System.out.println("최대픽셀Y	: " + this.maxPixelY);
	}
}
