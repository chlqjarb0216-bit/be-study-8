package be_study.quiz.quiz29;

public class Person {
	String name;
	String sex;
	int age;
	double height;
	double weight;
	String job;
	String blood;
	Condition condition;
	boolean isSleeping;

	Person() {
		this("John Doe");
	}

	Person(String name) {
		this(name, "male");
	}

	Person(String name, String sex) {
		this(name, sex, 20);
	}

	Person(String name, String sex, int age) {
		this(name, sex, age, 180);
	}

	Person(String name, String sex, int age, double height) {
		this(name, sex, age, height, 70);
	}

	Person(String name, String sex, int age, double height, double weight) {
		this(name, sex, age, height, weight, "None");
	}

	Person(String name, String sex, int age, double height, double weight, String job) {
		this(name, sex, age, height, weight, job, "O+");
	}

	Person(String name, String sex, int age, double height, double weight, String job, String blood) {
		this(name, sex, age, height, weight, job, blood, Condition.GOOD);
	}

	Person(String name, String sex, int age, double height, double weight, String job, String blood,
			Condition condition) {
		this(name, sex, age, height, weight, job, blood, condition, true);
	}

	Person(String name, String sex, int age, double height, double weight, String job, String blood,
			Condition condition, boolean isSleeping) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.blood = blood;
		this.condition = condition;
		this.isSleeping = isSleeping;
	}
}
