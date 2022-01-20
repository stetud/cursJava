package curs8;

public class Bicicleta extends Vehicul {

	public Bicicleta(String brand, String nivelPoluare, String vitezaMedie) {
		super(brand, nivelPoluare, vitezaMedie);
	}
	
	public String nume() {
		String nume = "pegas";
		return nume;
	}

	public String motorizare() {
		String motorizare = "electric";
		return motorizare;
	}

	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru " + getBrand() + " este: " + getNivelPoluare() + " si viteza medie atinsa este de " + getVitezaMedie());
	}

}
