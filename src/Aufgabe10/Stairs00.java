package Aufgabe10;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 15.06.16
 */
public class Stairs00 {
    private int steps;
    private int width;

    /**
     * @return
     */
    public int getSteps() {
        return steps;
    }

    /**
     * @param steps
     */
    public void setSteps(int steps) {
        this.steps = steps;
    }

    /**
     * @return
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     *
     */
    public Stairs00() {
        this(10, 3);
    }

    /**
     * @param steps
     * @param width
     */
    public Stairs00(int steps, int width) {
        this.steps = steps;
        this.width = width;
    }

    /**
     *
     */
    public void printStairs00() {
        System.out.print(this);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        String stairs = "";

        for(int i = 1; i <= this.steps; i++) {
            for(int o = 0; o < this.width * i; o++) {
                stairs += "* ";
            }

            stairs += "\n";
        }

        return stairs;
    }
}
