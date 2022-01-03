package curs6;

public class Duplicate {

	public static void main (String[] args) {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		
		for (int i = 0; i < myStringArray.length; i++) {
			for (int j = i+1; j < myStringArray.length; j++) {
				if (myStringArray[i] == myStringArray[j]) {
					System.out.println("Nume duplicat " + myStringArray[j]);
				}
			}
		}
	}
}
