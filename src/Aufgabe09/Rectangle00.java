package Aufgabe09;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 22.06.16
 */
public class Rectangle00 {
    private int a;
    private int b;

    public Rectangle00(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle00() {
        this(0, 0);
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    /**
     * Durch Schleifen werden die * und Leerzeichen ausgegeben. Dabei wird die erste und letzte Zeile besonders behandelt,
     * da sie nur * enthalten soll.
     */
    public void drawRectangle00() {
        for(int i = 0; i < this.a; i++) {
            if(i == 0 || i == (this.a - 1)) {
                for (int o = 0; o < this.b; o++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            } else {
                System.out.print("*");
                for (int o = 0; o < (this.b - 2); o++) {
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
    }
}
