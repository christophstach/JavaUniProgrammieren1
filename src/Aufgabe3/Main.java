package Aufgabe3;

import java.util.Scanner;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 04.05.2016
 */
public class Main {
    public static void main(String[] args) {
        Main.egyptianAlgorithm();
        System.out.println("------------------------------------------------------------");
        Main.pqFormular();
        System.out.println("------------------------------------------------------------");
        Main.findPrimeNumbersAndSum();
    }

    /**
     * Aufgabe 3.7
     *
     * Ägyptischer Algorithmus
     */
    public static void egyptianAlgorithm() {
        Scanner scanner = new Scanner(System.in);
        int zahl1, zahl2, ergebnis = 0;

        System.out.print("Bitte Zahl 1 eingeben: ");
        zahl1 = scanner.nextInt();
        System.out.print("Bitte Zahl 2 eingeben: ");
        zahl2 = scanner.nextInt();

        while(zahl1 > 0) {
            if(zahl1 % 2 == 1) {
                // Zahl ist ungerade
                ergebnis += zahl2;
            }

            zahl1 /= 2;
            zahl2 *= 2;
        }

        System.out.println("Ergebnis: " + ergebnis);

    }

    /**
     * Aufgabe 3.8
     *
     * pq-Formel
     *                  a   p   q
     * am Beispiel von: 2x² -4x -16 = 0
     */
    public static void pqFormular() {
        double a = 2, p = -4, q = -16, x1, x2;

        p /= a;
        q /= a;

        x1 = (-1) * (p / 2) + Math.sqrt(Math.pow(p / 2, 2) - q);
        x2 = (-1) * (p / 2) - Math.sqrt(Math.pow(p / 2, 2) - q);

        if(Double.isNaN(x1)) {
            System.out.println("Keine Nullstelle (Ergebnis) für x1");
        } else {
            System.out.println("x1 = " + x1);
        }

        if(Double.isNaN(x2)) {
            System.out.println("Keine Nullstelle (Ergebnis) für x2");
        } else {
            System.out.println("x2 = " + x2);
        }
    }

    /**
     * Aufgabe 3.9
     *
     * Primzahlen finden und summieren
     */
    public static void findPrimeNumbersAndSum() {
        int summe = 0, anzahl = 0;

        //Da 1 keine  Primzahl (p >= 1) ist fangen wir bei 2 an
        for(int p = 2; p <= 100; p++) {
            boolean isPrimeNumber = true;

            for(int i = 2; i < p; i++) {
                if(p % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if(isPrimeNumber) {
                summe += p;
                anzahl++;
            }
        }

        System.out.println("Die Summe aller Primzahlen von 1 bis 100 beträgt: " + summe);
        System.out.println("Die Anzahl aller Primzahlen von 1 bis 100 beträgt: " + anzahl);
    }
}
