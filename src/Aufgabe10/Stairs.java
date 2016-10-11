package Aufgabe10;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 15.06.16
 */
public class Stairs {
    /**
     * Treppe (nicht objektorientiert)
     * Aufgabe 9.3.1
     *
     * @param h
     * @param b
     */
    public static void printStairs(int h, int b) {
        for(int i = 1; i <= h; i++) {
            for(int o = 0; o < b * i; o++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
