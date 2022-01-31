package curs9;

public abstract class Account {
	private int accountNumber;
	public double balance;
	public Customer accountOwner;

	public Account(Customer accountOwner, double balance, int accountNumber) {
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public abstract void withdraw(double sumaDeRetras) throws InsufficientFundsException;
}