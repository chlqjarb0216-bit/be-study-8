package be_study.quiz.quiz45;

public class Dropship extends Unit {
	@Override
	void move(int x, int y) {
		System.out.print("드랍쉽 날아서 ");
		super.move(x, y);
	}

	void load() {
		System.out.println("선택된 대상을 태운다.");
	}

	void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
}
