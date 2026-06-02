package be_study.quiz.quiz45;

public class Marine extends Unit {
	@Override
	void move(int x, int y) {
		System.out.print("마린 걸어서 ");
		super.move(x, y);
	}

	void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}
