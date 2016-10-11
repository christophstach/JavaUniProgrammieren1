package Aufgabe06;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 25.05.2016
 */
public class Main {
    public static void main(String[] args) {
        Main.teilbarkeit();
        System.out.println("PI ist: " + Main.calculatePi());
        System.out.println("4 ^ 5 = " + Main.pow(4, 5));
    }

    /**
     * Aufgabe 6.6 :: Teilbarkeit
     */
    public static void teilbarkeit() {
        for(int i = 100; i <= 999; i++) {
            if(i % 10 != 0 && (i / 10) % 10 != 0) {
                int zifferA = i % 10;
                int zifferB = (i / 10) % 10;
                int zifferC = (i / 10) / 10;

                if(i % zifferA == 0 && i % zifferB == 0 && i % zifferC == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    /**
     * Aufgabe 6.7 :: PI berechnen
     */
    public static double calculatePi() {
        double pi = 0;

        for(int i = 0; i < 1000; i++) {
            if(i % 2 == 0) {
                pi += 4d / (i * 2 + 1);
                //System.out.print(" +4/" + (i * 2 + 1));
            } else {
                pi -= 4d / (i * 2 + 1);
                //System.out.print(" -4/" + (i * 2 + 1));
            }
        }

        return pi;
    }

    /**
     * Aufgabe 6.8 :: Rekursion
     */
    public static int pow(int base, int exponent) {
        if(exponent != 1) {
            return base * Main  .pow(base, exponent - 1);
        } else {
            return base;
        }
    }
}
