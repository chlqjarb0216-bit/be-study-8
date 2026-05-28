package be_study.quiz.quiz36.q4;

public class Computer {
	public static String[] osType = { "윈도우10", "애플 OS X", "안드로이드" };
	String currentOS;
	int memory;

	public Computer(int os, int memory) {
		this.currentOS = Computer.osType[os];
		this.memory = memory;
	}

	public void print() {
		System.out.println("운영체제: " + this.currentOS + ", 메인메모리: " + this.memory);
	}
}
