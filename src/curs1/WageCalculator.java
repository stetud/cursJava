package curs1;

public class WageCalculator {
	
	public static void main(String[] args) {
		
		Tester tester1 = new Tester();
		tester1.setNume("Stefan");
		tester1.setAge(24);	
		
		System.out.println(tester1.getNume() + " are: " + tester1.getAge() + " ani!");
	}
}
