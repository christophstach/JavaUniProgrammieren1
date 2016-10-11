package Aufgabe11;

/**
 * Aufgabe 8.7 :: Gerade
 * 
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 08.06.2016
 */
public class Gerade {
    private int m;
    private int t;

    /**
     * @param m Steigung
     * @param t Y-Achsenabschnitt
     * @return
     */
    public Gerade(int m, int t) {
        this.m = m;
        this.t = t;
    }
    
    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @return the t
     */
    public int getT() {
        return t;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        this.m = m;
    }

    /**
     * @param t the t to set
     */
    public void setT(int t) {
        this.t = t;
    }
    
    /**
     * @param p Schnittpunkt, durch welchen die Gerade nach der Verschiebung laufen soll
     */
    public void verschiebe(Punkt p) {
        this.t = p.getY() - (this.m * p.getX()); 
    }
    
    /**
     * 
     */
    public void spiegeleAnXAchse() {
        this.m *= -1;
        this.t *= -1;
    }
    
    /**
     * @param x
     * @param y
     * @return
     */
    public boolean istPunktAufGerade(int x, int y) {
        return ((this.m * x) + this.t) == y; 
    }
    
    /**
     * Gibt die Geradengleichung aus.
     */
    public void printGeradenGleichung() {
        if(this.t >= 0) {
            System.out.printf("y = %dx + %d\n", this.m, this.t);
        } else {
            System.out.printf("y = %dx - %d\n", this.m, this.t * (-1));
        }
    }
}
