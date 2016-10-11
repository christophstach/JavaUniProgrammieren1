package Aufgabe01;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 27.04.2016
 */
public class Main {
    /**
     *
     * @param number Die zu &uuml;berpr&uuml;fende Zahl
     * @return Gibt zur&uuml;ck ob die Zahl eine Primzahl ist
     */
    public static boolean isPrimeNumber(int number) {
        boolean isPrimeNumber = true;

        if(number != 1 && number != 2) {
            for(int i = 3; i < number; i += 2) {
                if(number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        return isPrimeNumber;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 60;

        while(!Main.isPrimeNumber(n)) {
            for(int i = 2; i < n; i++) {
                if(n % i == 0) {
                    System.out.print(i + " * ");
                    n = n / i;

                    break;
                }
            }
        }

        System.out.print(n);
    }
}
