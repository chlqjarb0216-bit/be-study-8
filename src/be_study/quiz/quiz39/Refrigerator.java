package be_study.quiz.quiz39;

public class Refrigerator {
	String brand;
	double volume;
	boolean isPowerOn;

	int temperature;
	int tempMax;
	int tempMin;

	int numDoor;

	boolean hasIceTray;
	IceTray iceTray;

	public void powerOff() {
		this.isPowerOn = false;
	}

	public void powerOn() {
		this.isPowerOn = true;
	}

	//	public int temperatureUp() {
	//		this.temperature++;
	//		return this.temperature;
	//	}
	//
	//	public int temperatureDown() {
	//		this.temperature--;
	//		return this.temperature;
	//	}

	public boolean temperatureUp() {
		if (this.temperature < this.tempMax) {
			this.temperature++;
			return true;
		}
		return false;
	}

	public boolean temperatureDown() {
		if (this.temperature > this.tempMin) {
			this.temperature--;
			return true;
		}
		return false;
	}

	//	public boolean setTemperature(int temp) {
	//		if (temp < this.tempMin || temp > this.tempMax)
	//			return false;
	//		this.temperature = temp;
	//		return true;
	//	}

	public void setTemperature(int temp) {
		if (temp < this.tempMin)
			this.temperature = this.tempMin;
		if (temp > this.tempMax)
			this.temperature = this.tempMax;
		this.temperature = temp;
	}
}
