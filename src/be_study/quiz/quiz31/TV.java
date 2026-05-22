package be_study.quiz.quiz31;

public class TV {
	String productor;
	int year;
	int inch;

	TV(String productor, int year, int inch) {
		this.productor = productor;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", this.productor, this.year, this.inch);
	}
}
