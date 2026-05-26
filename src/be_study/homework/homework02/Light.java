package be_study.homework.homework02;

public class Light {
	String type;
	double maxBrightness;
	int price;
	String productor;
	boolean hasControlBrightness;
	double brightness;

	Light() {
	}

	Light(String type, double maxBrightness, int price) {
		this.type = type;
		this.maxBrightness = maxBrightness;
		this.price = price;
	}

	Light(String type, double maxBrightness, int price, String productor, boolean hasControlBrightness,
			double brightness) {
		this.type = type;
		this.maxBrightness = maxBrightness;
		this.price = price;
		this.productor = productor;
		this.hasControlBrightness = hasControlBrightness;
		this.brightness = brightness;
	}

	void turnOff() {

	}

	void turnOn() {
	}

	double addBrightness(double brightness) {
		if (!this.hasControlBrightness) {
			return -1;
		}
		this.brightness += brightness;
		if (this.brightness > this.maxBrightness) {
			this.brightness = this.maxBrightness;
		}
		return this.brightness;
	}
}
