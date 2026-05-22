package be_study.quiz.quiz31;

public class Rectangle {
	int length;
	int height;

	Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
	}

	int getArea() {
		return this.length * this.height;
	}
}
