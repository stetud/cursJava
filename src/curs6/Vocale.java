package curs6;

public class Vocale {

	public static void main(String[] args) {
		String text = "Eu invat Java";
		int vocale = 0;
		
		for (int i=0; i<text.length(); i++) {
			if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
				vocale++;
			}
		}
		
		System.out.println("Vocale: " + vocale);
		
	}
}
