package curs9;

public class SavingsAccount extends Account {

	public SavingsAccount(Customer accountOwner, double balance, int accountNumber) {
		super(accountOwner, balance, accountNumber);
	}

	@Override
	public void withdraw(double sumaDeRetras) throws InsufficientFundsException {
		if (sumaDeRetras > balance) {
			throw new InsufficientFundsException("Insufficient funds for transaction.");
		} else {
			balance = balance - sumaDeRetras;
		}
	}
}