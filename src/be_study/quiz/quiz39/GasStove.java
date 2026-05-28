package be_study.quiz.quiz39;

public class GasStove {
	int numFire;
	String brand;
	int price;
	boolean[] isFireOn;
	int[] power;

	public boolean[] fireOn(int idx) {
		this.isFireOn[idx] = true;
		this.power[idx] = 5;
		return this.isFireOn;
	}

	public boolean[] fireOff(int idx) {
		this.isFireOn[idx] = false;
		this.power[idx] = 0;
		return this.isFireOn;
	}

	public int setPower(int idx, int power) {
		this.power[idx] = power;
		return this.power[idx];
	}
}
