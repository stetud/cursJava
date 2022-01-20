package curs8;

public class TestVehicul {
	
	public static void main(String[] args) {

		Vehicul masina = new Masina("Mercedes", "EURO 5", "280");
		Vehicul bicicleta = new Bicicleta("Pegas", "NON-EURO", "20");
		verificaMotorizarea(masina);
		verificaMotorizarea(bicicleta);
		masina.detaliiVehicul();
		bicicleta.detaliiVehicul();
	}

	public static void verificaMotorizarea(Vehicul vehicul) {
		System.out.println(vehicul.nume());
		System.out.println(vehicul.motorizare());
	}
	
}
