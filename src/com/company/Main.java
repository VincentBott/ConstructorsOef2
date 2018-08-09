package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Werknemer[] werknemers = new Werknemer[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < werknemers.length; i++) {

            System.out.print("Geef naam: ");

            String naam = scanner.nextLine();

            System.out.print("Geef loon: ");

            int loon = Integer.parseInt(scanner.nextLine());

            Werknemer w = new Werknemer(naam, loon);
            werknemers[i] = w;
        }

        int totaal=0;

        for (Werknemer w: werknemers){
            totaal += w.getLoon();
        }

        double gemiddelde = (double)totaal/werknemers.length;
        System.out.printf("het gemiddelde loon is %.2f", gemiddelde);
    }
}
