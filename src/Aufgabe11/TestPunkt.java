package Aufgabe11;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 01.06.2016
 */
public class TestPunkt {
    public static void main (String[] args){
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt();

        
        p1.setX(5); p1.setY(10);
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());
        
        p1.verschiebe(-4, -10);
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());
        
        p1.verschiebeInnerhalb(15, 17);
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());
        
        p1.verschiebeInnerhalb(5, 5);
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());

        
        p1.setX(1);
        p1.setY(2);
        p2.setX(4);
        p2.setY(5);
        p1.berechneGeradenGleichung(p2);
        
        p1.setX(1);
        p1.setY(2);
        p2.setX(1);
        p2.setY(5);
        p1.berechneGeradenGleichung(p2);
        
        
        p1.spiegeleAnXAchse();
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());
        
        p1.spiegeleAnYAchse();
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());
        
        p1.spiegeleAnUrsprung();
        System.out.printf("%d,%d \n", p1.getX(), p1.getY());
    }
}
