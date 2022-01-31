package curs9;

import java.util.Scanner;

public class TestSavingsAccount {
	public static void main(String[] args) throws InsufficientFundsException {
		Customer stefan = new Customer("Stefan", "New York", "stefan@bitdefender.com");
		SavingsAccount savingsAccount = new SavingsAccount(stefan, 2000, 123);
		System.out.println("Hi, " + stefan.getName());
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the amount to withdraw: ");
		double sumaDeRetras = scan.nextDouble();
		try {
			savingsAccount.withdraw(sumaDeRetras);
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + savingsAccount.balance);
		} catch (InsufficientFundsException e) {
			System.out.println("The amount you entered is greater than the available balance: " + savingsAccount.balance);
			e.printStackTrace();
		} 
			System.out.println("Thank you for using our ATM!");
	}
}