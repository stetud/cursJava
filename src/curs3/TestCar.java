package curs3;

public class TestCar {
	
	public static void main(String[] args) {
		
		Car masina1 = new Car("BMW", "DIESEL");
		System.out.println(masina1.carDetails());
		
		Car masina2 = new Car("VW", "BENZINA");
		masina2.type = "SEDAN";
		
		System.out.println(masina2.carDetails());
		
		System.out.println(masina1.carDetails());
		
	}

}