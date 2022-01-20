package curs8;

public class Vehicul {

	private String brand;
	private String nivelPoluare;
	private String vitezaMedie;
	
	public Vehicul(String brand, String nivelPoluare, String vitezaMedie) {
		this.brand = brand;
		this.nivelPoluare = nivelPoluare;
		this.vitezaMedie = vitezaMedie;
	}
	
	public String nume() {
		String nume = null;
		return nume;
	}
	
	public String motorizare() {
		String motorizare = null;
		return motorizare;
	}
	
	public String getBrand() {
		return brand;
	}

	public String getNivelPoluare() {
		return nivelPoluare;
	}


	public String getVitezaMedie() {
		return vitezaMedie;
	}

	
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru " + getBrand() + " este: " + getNivelPoluare() + " si viteza medie atinsa este de " + getVitezaMedie());
	}
	
}
