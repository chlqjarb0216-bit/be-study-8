package be_study.quiz.quiz31;

public class Triangle {
	int length;
	int height;

	void setSize(int length, int height) {
		this.length = length;
		this.height = height;
	}

	double getArea() {
		return this.length * this.height / 2.0;
	}
}
