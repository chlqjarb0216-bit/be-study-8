package be_study.quiz.quiz45;

public class UnitMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Dropship d1 = new Dropship();

		Unit[] arr = { t1, m1, d1 };

		for (Unit u : arr) {
			u.move(10, 20);
			u.stop();
		}

		t1.changeMode();
		m1.stimPack();
		d1.load();
		d1.unload();

		Unit u1 = new Unit(); //?? 무슨유닛?
		Unit u2 = new Unit(); //?? 마린 탱크 드랍쉽.. 벌처 메딕 질럿...

	}
}
