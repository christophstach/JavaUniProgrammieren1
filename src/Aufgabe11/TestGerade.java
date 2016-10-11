package Aufgabe11;

/**
 * Aufgabe 8.7 :: Gerade
 * 
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 08.06.2016
 */
public class TestGerade {

    public static void main(String[] args) {
        Gerade g = new Gerade(5, 4);
        Punkt p1 = new Punkt(1, 10);
        
        g.printGeradenGleichung();
        
        g.verschiebe(p1);
        g.printGeradenGleichung();
        
        g.setM(5);
        g.setT(4);
        
        g.spiegeleAnXAchse();
        g.printGeradenGleichung();
        
        g.setM(5);
        g.setT(4);
        
        System.out.printf("Punkt (2|14) liegt auf der Geraden: %b\n", g.istPunktAufGerade(2, 14));
        System.out.printf("Punkt (2|10) liegt auf der Geraden: %b\n", g.istPunktAufGerade(2, 10));

    }

}
