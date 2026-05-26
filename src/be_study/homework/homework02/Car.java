package be_study.homework.homework02;

public class Car {
	String model;
	String productor;
	String color;
	int price;
	int maxPerson;
	int person;
	double maxWeight;
	double weight;
	double maxSpeed;
	double speed;

	Car() {
	}

	Car(String model, String productor, String color, int price) {
		this.model = model;
		this.productor = productor;
		this.color = color;
		this.price = price;
	}

	Car(String model, String productor, String color, int price, int maxPerson, int person, double maxWeight,
			double weight, double maxSpeed, double speed) {
		this.model = model;
		this.productor = productor;
		this.color = color;
		this.price = price;
		this.maxPerson = maxPerson;
		this.person = person;
		this.maxWeight = maxWeight;
		this.weight = weight;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

	int board(int person) {
		if (this.person + person <= this.maxPerson) {
			this.person += person;
			return this.person;
		}
		System.out.println("탑승인원 초과");
		return -1;
	}

	int unboard(int person) {
		if (person <= this.person) {
			this.person -= person;
			return this.person;
		}
		System.out.println("내릴 사람이 부족합니다");
		return -1;
	}

	double load(double weight) {
		if (this.weight + weight <= this.maxWeight) {
			this.weight += weight;
			return this.weight;
		}
		System.out.println("중량 초과");
		return -1;
	}

	double unload(double weight) {
		if (weight <= this.weight) {
			this.weight -= weight;
			return this.weight;
		}
		System.out.println("내릴 중량이 부족합니다");
		return -1;
	}

	double faster(double speed) {
		if (this.speed + speed <= this.maxSpeed) {
			this.speed += speed;
			return this.speed;
		}
		System.out.println("최고 속도 초과");
		return -1;
	}

	double slower(double speed) {
		this.speed -= speed;
		if (this.speed < 0) {
			this.speed = 0;
		}
		return this.speed;
	}
}
