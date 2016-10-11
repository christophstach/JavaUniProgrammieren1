package Aufgabe11;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 08.06.2016
 */
public class Punkt {
    private int x;
    private int y;
    
    /**
     * 
     */
    public Punkt() {
        
    }
    
    /**
     * @param x
     * @param y
     */
    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * 
     * @param i
     */
    public void setX (int i) {
        x = i;
    }
    
    /**
     * 
     * @param i
     */
    public void setY (int i) {
        y = i;
    }
    
    /**
     * 
     * @return
     */
    public int getX(){
        return x;
    }
    
    /**
     * 
     * @return
     */
    public int getY(){
        return y;
    }
    
    /**
     * 
     * @param deltaX
     * @param deltaY
     */
    public void verschiebe(int deltaX, int deltaY){
        x = x + deltaX;
        y = y + deltaY;
    }
    
    /**
     * Aufgabe 7.7
     * 
     * @param deltaX
     * @param deltaY
     */
    public void verschiebeInnerhalb(int deltaX, int deltaY) {
        if(
            (this.x + deltaX >= -10 && this.x + deltaX <= 10) && 
            (this.y + deltaY >= -10 && this.y + deltaY <= 10)
        ) {
            this.verschiebe(deltaX, deltaY);
        }
    }
    
    /**
     * Aufgabe 7.8
     * 
     * @param punkt
     */
    public void berechneGeradenGleichung(Punkt punkt) {
    	float m, n;
    	
    	if(punkt.getX() - this.getX() != 0) {
    		m = (float)(punkt.getY() - this.getY()) / (float)(punkt.getX() - this.getX());
    		n = this.getY() - m * this.getX();
    		
    		/**
    		 * Ich mache das Mit Math.abs um die Ausgabe ein wenig zu verschönern ;-)
    		 */
    		if(n < 0) {
    			System.out.printf("y = %.2fx - %.2f\n", m, Math.abs(n));
    		} else {
    			System.out.printf("y = %.2fx + %.2f\n", m, n);	
    		}
    		
    	} else {
    		System.out.println("Fehler: Division durch 0.");
    	}
    }
    
    /**
     * Aufgabe 8.6 :: Punkte spiegeln
     */
    public void spiegeleAnXAchse() {
        this.y *= -1;
    }
    
    /**
     * Aufgabe 8.6 :: Punkte spiegeln
     */
    public void spiegeleAnYAchse() {
        this.x *= -1;
    }
    
    /**
     * Aufgabe 8.6 :: Punkte spiegeln
     */
    public void spiegeleAnUrsprung() {
        this.spiegeleAnXAchse();
        this.spiegeleAnYAchse();
    }
}
