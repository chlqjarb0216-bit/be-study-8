package be_study.homework.homework02;

public class TV {
	int size;
	String model;
	String productor;
	int price;
	int channel;
	int volume;
	int maxVolume;
	Mode mode;

	TV() {
	}

	TV(int size, String model, String productor, int price) {
		this.size = size;
		this.model = model;
		this.productor = productor;
		this.price = price;
	}

	TV(int size, String model, String productor, int price, int channel, int volume, int maxVolume, Mode mode) {
		this.size = size;
		this.model = model;
		this.productor = productor;
		this.price = price;
		this.channel = channel;
		this.volume = volume;
		this.maxVolume = maxVolume;
		this.mode = mode;
	}

	void turnOff() {

	}

	void turnOn() {

	}

	int turnChannel(int channel) {
		if (channel <= 0) {
			return -1;
		}
		this.channel = channel;
		return this.channel;
	}

	int turnVolume(int volume) {
		if (volume <= 0 && volume > this.maxVolume) {
			return -1;
		}
		this.volume = volume;
		return this.volume;
	}

	Mode changeMode(Mode mode) {
		this.mode = mode;
		return this.mode;
	}
}
