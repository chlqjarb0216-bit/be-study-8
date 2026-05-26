package be_study.homework.homework02;

public class Cup {
	double maxVolume;
	String color;
	String type;
	String material;
	int price;
	String liquid;
	double liquidVolume;

	Cup() {
	}

	Cup(double maxVolume, String color, String type, String material, int price) {
		this.maxVolume = maxVolume;
		this.color = color;
		this.type = type;
		this.material = material;
		this.price = price;
	}

	Cup(double maxVolume, String color, String type, String material, int price, String liquid, double liquidVolume) {
		this.maxVolume = maxVolume;
		this.color = color;
		this.type = type;
		this.material = material;
		this.price = price;
		this.liquid = liquid;
		this.liquidVolume = liquidVolume;
	}

	void clear() {
		this.liquidVolume = 0;
	}

	void wash() {
		this.liquid = null;
		this.liquidVolume = 0;
	}

	void fill(String liquid, double liquidVolume) {
		this.liquid = liquid;
		this.liquidVolume = liquidVolume <= this.maxVolume ? liquidVolume : this.maxVolume;
	}

	double consume(double volume) {
		if (volume <= this.liquidVolume) {
			this.liquidVolume -= volume;
			return this.liquidVolume;
		}
		return -1;
	}
}
