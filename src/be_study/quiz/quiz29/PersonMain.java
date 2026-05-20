package be_study.quiz.quiz29;

public class PersonMain {

	public static void main(String[] args) {
		Person me = new Person();
		me.name = "Beomgyu Choi";
		me.sex = "M";
		me.age = 30;
		me.height = 165;
		me.weight = 70;
		me.job = "student";
		me.blood = "O+";
		me.condition = Condition.NORMAL;
		me.isSleeping = true;

		System.out.println(me.name);
		System.out.println(me.sex);
		System.out.println(me.age);
		System.out.println(me.height);
		System.out.println(me.weight);
		System.out.println(me.job);
		System.out.println(me.blood);
		System.out.println(me.condition);
		System.out.println(me.isSleeping);
	}

}
