package Aufgabe9;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 22.06.16
 */
public class Rectangle {
    /**
     * Durch Schleifen werden die * und Leerzeichen ausgegeben. Dabei wird die erste und letzte Zeile besonders behandelt,
     * da sie nur * enthalten soll.
     */
    public static void drawRectangle(int a, int b) {
        for(int i = 0; i < a; i++) {
            if(i == 0 || i == (a - 1)) {
                for (int o = 0; o < b; o++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                System.out.print("*");
                for (int o = 0; o < (b - 2); o++) {
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
    }
}
