package be_study.quiz.quiz36.q3;

public class AccountMain {

	public static void main(String[] args) {
		Account a1 = new Account("John", 1000000);
		a1.deposit(1000000);
		a1.withdraw(1500000);
		System.out.println(a1.getBalance());

		System.out.println(a1.withdraw(1000000));
	}

}
