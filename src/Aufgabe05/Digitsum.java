package Aufgabe05;

/**
 * Created by Christoph Stach on 18.05.16.
 * Aufgabe 5.5 :: Quersummen
 */
public class Digitsum {
    /**
     * Main Methode
     *
     * @param args
     */
    public static void main(String[] args) {
        Digitsum.printDigitsumFifteen();
        Digitsum.printDigitsumSeven();
    }

    /**
     * Rechnet die Quersummer einer Zahl aus.
     *
     * @param number
     * @return
     */
    public static int getDigitsum(int number) {
        int sum = 0;

        while(number / 10 != 0) {
            sum += number % 10;
            number /= 10;
        }

        sum += number;

        return sum;
    }

    /**
     * Gibt alle Zahlen mit einer Quersumme von 15 zwischen 1 und 1000 aus.
     * 5.5a
     */
    public static void printDigitsumFifteen() {
        final int ITERATION_START = 1;
        final int MAX_ITERATIONS = 1000;
        final int DIGITSUM_TO_VALIDATE = 15;

        for(int i = ITERATION_START; i <= MAX_ITERATIONS; i++) {
            if(Digitsum.getDigitsum(i) == DIGITSUM_TO_VALIDATE) {
                System.out.printf("%d hat die Quersumme %d. \n", i, DIGITSUM_TO_VALIDATE);
            }
        }
    }

    /**
     * Gibt alle Zahlen mit einer Quersumme von 15 zwischen 1 und 1000 aus.
     * 5.5b
     */
    public static void printDigitsumSeven() {
        final int ITERATION_START = 1;
        final int MAX_ITERATIONS = 1000;
        final int DIGITSUM_TO_VALIDATE = 7;

        for(int i = ITERATION_START; i <= MAX_ITERATIONS; i++) {
            if(Digitsum.getDigitsum(i) == DIGITSUM_TO_VALIDATE) {
                System.out.printf("%d hat die Quersumme %d. \n", i, DIGITSUM_TO_VALIDATE);
            }
        }
    }
}
