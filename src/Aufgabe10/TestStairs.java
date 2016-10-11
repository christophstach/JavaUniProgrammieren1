package Aufgabe10;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 15.06.16
 */
public class TestStairs {
    public static void main(String[] args) {
        Stairs.printStairs(7, 4);

        Stairs00 stairs = new Stairs00(7, 4);
        stairs.printStairs00();
    }
}
