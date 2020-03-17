package com.romain;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("CONVERTISSEUR DE DEGRES CELSIUS ET FAHRENHEIT");
        String rep;
        do {
            Scanner sc = new Scanner (System.in);
            int md;
            do{
                System.out.println("Choisissez votre mode de conversion : ");
                System.out.println("1 - Celsius - Fahrenheit");
                System.out.println("2 - Fahrenheit - Celsius");
                String mode = sc.nextLine();
                md = Integer.parseInt(mode);

            } while(( md != 1 ) && ( md != 2));

            System.out.println("Température à convertir : ");
            String temp = sc.nextLine();
            double tmp = Double.parseDouble(temp);
            if (md == 1) {
                double result = (tmp*(9./5.)) + 32;
                System.out.println(tmp + "°C correspond à " + result + "°F.");
            }
            else {
                double result = (tmp - 32.) * 5. / 9.;
                System.out.println(tmp + "°F correspond à " + result + "°C. ");

            }
            System.out.println("Voulez-vous convertir une autre température ? (O/N)");
            rep = sc.nextLine();

        } while(rep.equals("O"));

        System.out.println("Au revoir !");


    }
}
