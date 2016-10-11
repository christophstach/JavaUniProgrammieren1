package Aufgabe9;

import java.util.Arrays;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 22.06.16
 */
public class TestPrimeNumberCalculator {
    public static void main(String[] args) {
        PrimeNumberCalculator calc = new PrimeNumberCalculator();

        System.out.println(ArrayUtils.arrayToString(calc.getPrimeNumbers(100)));
        calc.printPrimerNumber(100);
    }
}
