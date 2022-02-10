package curs10;

import java.io.IOException;
import java.util.Scanner;


public class TestCalorii {

    public static void main(String[] args) throws IOException {

        Calorii calorii = new Calorii();
        Stocuri stocuri = new Stocuri();
        Scanner scan = new Scanner(System.in);
        String leguma;
        boolean condition = true;

        System.out.println("Ce leguma vrei sa cumperi?");
        do {
            leguma = scan.nextLine();
            if (stocuri.verificaLegumaInStoc(leguma) == true) {
                System.out.println("Leguma " + leguma + " are " + calorii.citireLegume(leguma) + " calorii");
                condition = false;
            } else {
                System.out.println("Nu vindem aceasta leguma!");
                System.out.println("Te rugam sa alegi alta leguma!");
            }
        } while(condition);
    }
}
