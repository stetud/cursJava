package curs6;

import java.util.Scanner;

public class NumbersArray {

	public static void main(String[] args) {
		int sum = 0, i;
		System.out.println("Introdu 10 numere:");
		Scanner scan = new Scanner(System.in);

		int[] numere = new int[10];
		for (i = 0; i < 10; i++) {
			numere[i] = scan.nextInt();
			sum = sum + numere[i];
		}
		System.out.println("Suma numerelor din array este: " + sum);
		
	}
}
