package Aufgabe05;

/**
 * Created by Christoph Stach on 18.05.16.
 * Aufgabe 5.6 :: Collatz-Problem
 */
public class CollatzConjecture {
    /**
     * Main Methode
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("Anzahl Terme iterative Methode: %d \n", CollatzConjecture.iterativeMethod(13));
        System.out.printf("Anzahl Terme rekursive Methode: %d \n", CollatzConjecture.recursiveMethod(13));
    }

    /**
     * Interative implementierung der Methode
     * 5.6a
     *
     * @param number
     * @return
     */
    public static int iterativeMethod(int number) {
        int i = 1;

        while(number != 1) {
            System.out.printf("%d -> ", number);

            if(number % 2 == 0) {
                //Ist gerade
                number /= 2;
            } else {
                //Ist ungerade
                number = 3 * number + 1;
            }

            i++;
        }

        System.out.printf("%d \n", number);

        return i;
    }

    /**
     * Rekursive implementierung der Methode
     * 5.6b
     *
     * @param number
     */
    public static int recursiveMethod(int number, int n) {
        if(number != 1) {
            System.out.printf("%d -> ", number);

            if(number % 2 == 0) {
                //Ist gerade
                number /= 2;
            } else {
                //Ist ungerade
                number = 3 * number + 1;
            }

            n = CollatzConjecture.recursiveMethod(number, n) + 1;
        } else {
            System.out.printf("%d \n", number);
        }

        return n;
    }

    /**
     * Funktionsüberlagerung der rekursiven Methode, damit n eine automatischen Startwert hat.
     *
     * @param number
     * @return
     */
    public static int recursiveMethod(int number) {
        return CollatzConjecture.recursiveMethod(number, 1);
    }
}
