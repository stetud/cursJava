package curs8;

public class Masina extends Vehicul {
	
	public Masina(String brand, String nivelPoluare, String vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}

	public String nume() {
		String nume = "Audi";
		return nume;
	}

	public String motorizare() {
		String motorizare = "3.0 V6";
		return motorizare;
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru " + getBrand() + " este: " + getNivelPoluare() + " si viteza medie atinsa este de " + getVitezaMedie());
	}

}
