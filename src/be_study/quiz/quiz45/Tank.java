package be_study.quiz.quiz45;

public class Tank extends Unit {
	@Override
	void move(int x, int y) {
		System.out.print("탱크 바퀴로 ");
		super.move(x, y);
	}

	void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
}
