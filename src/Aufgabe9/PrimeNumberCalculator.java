package Aufgabe9;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 22.06.16
 *
 * Aufgabe 10.10 :: Primzahlen im Array ausgeben.
 */
public class PrimeNumberCalculator {
    /**
     * Durch zwei geschachtelte Forschleifen werden die Primzahlen errechnet. Wurde eine Primzahl gefunden wird sie der
     * ArrayList hinzugefügt. Da ich zu faul bin das Arrays jedes mal neu zu erzeugen verwende ich die Klasse ArrayList
     * die weitaus komfortabler ist. ArrayList funktioniert jedoch nicht mit primitiven Datentypen deswegen
     * verwende ich die Klasse Integer.
     *
     * (Ich weis, ich habe es mir einfach gemacht!)
     *
     * @param max
     * @return
     */
    public int[] getPrimeNumbers(int max) {
        int[] primeNumbers = new int[0];

        for(int i = 2; i <= max; i++) {
            boolean isPrimeNumber = true;

            for (int o = 2; o < i; o++) {
                if(i % o == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if(isPrimeNumber) {
                primeNumbers = ArrayUtils.addToArray(primeNumbers, i);
            }
        }

        return primeNumbers;
    }


    /**
     * Ruft einfach nur getPrimeNumbers auf und gibt das zurückgegebene Integer-Array in einer Schleife aus.
     *
     * @param max
     */
    public void printPrimerNumber(int max) {
        int[] primeNumbers = this.getPrimeNumbers(max);

        for (Integer number : primeNumbers) {
            System.out.print(number + " ");
        }
    }
}
