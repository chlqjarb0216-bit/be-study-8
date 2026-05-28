package be_study.quiz.quiz39;

public class Sink {
	int width;
	int height;
	int depth;
	String color;
	String material;

	int getWidth() { // mm 기준
		return width;
	}

	double getWidthAsCm() { // cm 변환 반환
		return width / 10.; // 205mm -> 20.5cm
	}

	double getWidthAsM() { // M단위로 변환 반환
		return width / 1000.; // 205mm -> 0.205m	1200mm -> 1.2m
	}
}
