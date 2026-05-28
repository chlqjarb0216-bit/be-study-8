package be_study.quiz.quiz39;

public class TrashCan {
	double volume;
	String color;
	double occupied;
	boolean isOpen;

	public double trashIn(double vol) {
		this.occupied += vol / this.volume * 100;
		return this.occupied;
	}

	public void open() {
		this.isOpen = true;
	}

	public void close() {
		this.isOpen = false;
	}

	public double clear() {
		this.occupied = 0;
		return this.occupied;
	}
}
