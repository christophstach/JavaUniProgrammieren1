package Aufgabe04;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 11.05.2016
 */
public class Main {
    public static void main(String[] args) {
        int x = 371, y = 35, z = 56;

        System.out.println("Iterative Berechnung der Summe: " + Main.iterativeSum());
        System.out.println("Rekursive Berechnung der Summe: " + Main.recursiveSum());

        System.out.println("Die Quersumme der Zahl " + x + " beträgt: " + Main.digitSum(x));
        //System.out.println("Die Quersumme der Zahl " + x + " beträgt: " + Main.digitSum2(x));

        //System.out.println("Der größte gemeinsame Teiler von " + y + " und " + z + " iterativ ist: " + Main.ggtIterativ(y, z));
        System.out.println("Der größte gemeinsame Teiler von " + y + " und " + z + " rekursiv ist: " + Main.ggtRekursiv(y, z));
    }

    /**
     * Aufgabe 4.6
     * Summe rekursiv berechnen
     *
     * @param i
     * @param sum
     * @return
     */
    public static int recursiveSum(int i, int sum) {
        if(i > 0) {
            sum = Main.recursiveSum(i - 1, sum + i);
        }

        return sum;
    }

    /**
     * Aufgabe 4.6
     *
     * Summe rekursiv berechnen.
     * Methodeüberlagerung um Startwerte zu übergeben.
     *
     * @return
     */
    public static int recursiveSum() {
        return Main.recursiveSum(7, 0);
    }

    /**
     * Aufgabe 4.6
     * Summe iterativ berechnen.
     *
     * @return
     */
    public static int iterativeSum() {
        int sum = 0;

        for(int i = 0; i <= 7; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * Aufgabe 4.7
     * Quersumme
     *
     * @param number
     * @return
     */
    public static int digitSum2(int number) {
        int digitSum = 0;
        char[] digits = new Integer(number).toString().toCharArray();

        for(char digit: digits) {
            digitSum += Character.getNumericValue(digit);
        }

        return digitSum;
    }

    /**
     * Aufgabe 4.7
     * Quersumme
     *
     * @param number
     * @return
     */
    public static int digitSum(int number) {
        int digitSum = 0;

        while(number != number % 10) {
            digitSum += number % 10;
            number /= 10;
        }

        digitSum += number;

        return digitSum;
    }

    /**
     * Aufgabe 4.8
     * Größten gemeinsamer Teiler rekursiv berechnen.
     *
     * @param x
     * @param y
     * @return
     */
    public static int ggtRekursiv(int x, int y) {
        if(y == 0) {
            return x;
        } else if(x == 0) {
            return y;
        } else if(x > y) {
            return Main.ggtRekursiv(x - y, y);
        } else {
            return Main.ggtRekursiv(x, y - x);
        }
    }

    /**
     * Größten gemeinsamer Teiler iterativ berechnen.
     *
     * @param x
     * @param y
     * @return
     */
    public  static int ggtIterativ(int x, int y) {
        while(x != y) {
            if(x < y) {
                y -= x;
            } else {
                x -= y;
            }
        }

        return x;
    }
}
