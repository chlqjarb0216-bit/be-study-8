package be_study.quiz.quiz30;

public class Monitor {
	int inch;
	String productor;
	String model;

	Monitor(int inch, String productor, String model) {
		this.inch = inch;
		this.productor = productor;
		this.model = model;
	}

	void printInfo() {
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", this.productor, this.model, this.inch);
	}
}
