package be_study.quiz.quiz36.q3;

public class Account {
	private String owner;
	private long balance;

	public Account() {
	}

	public Account(String owner) {
		this.owner = owner;
	}

	public Account(long balance) {
		this.balance = balance;
	}

	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long deposit(long amount) {
		this.balance += amount;
		return this.balance;
	}

	public long withdraw(long amount) {
		if (this.balance < amount) {
			System.out.println("잔액이 부족합니다.");
			return this.balance;
		}
		this.balance -= amount;
		return this.balance;
	}
}
