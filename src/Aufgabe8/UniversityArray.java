package Aufgabe8;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 21.06.16
 */
public class UniversityArray {
    /**
     * Aufgabe 10.6 :: Umgekehrte Reihenfolge
     *
     * @param doubleArray
     * @return
     */
    public double[] reverseArray(double[] doubleArray) {
        double[] newDoubleArray = new double[doubleArray.length];
        int i = 1;

        for (double value : doubleArray) {
            newDoubleArray[doubleArray.length - i] = value;
            i++;
        }

        return newDoubleArray;
    }

    /**
     * Aufgabe 10.6 :: Mittelwert der Array-Elemente berechnen
     * Die Funktion bildet zuerst die Summe aller Array-Elemente und teilt sie danach durch die Anzahl der Elemente
     * des Arrays.
     *
     * @param doubleArray
     * @return
     */
    public double average(double[] doubleArray) {
        double sum = 0;

        for (double value: doubleArray) {
            sum += value;
        }

        return doubleArray.length == 0 ? 0 : (sum / (double) doubleArray.length);
    }

    /**
     * Aufgabe 10.8 :: Differenz von Minimum und Maximum
     * Zuerst wird Min-Wert und Max-Wert des Arrays rausgesucht und danach voneinander abgezogen.
     * Wenn das Array leer ist wird 0 zurückgegeben.
     *
     * @param doubleArray
     * @return
     */
    public int differenceMinMax(int[] doubleArray) {
        if(doubleArray.length != 0) {
            int min = doubleArray[0];
            int max = 0;

            for (int value: doubleArray) {
                min = value < min ? value : min;
                max = value > max ? value : max;
            }

            return (max - min);
        } else {
            return 0;
        }
    }

    /**
     * Aufgabe 10.9 :: Konsolenausgabe zweidimensionales Array
     * Die Schleife geht alle Werte des Äußeren Arrays durch und gibt die jeweiligen Unter-Arrays aus.
     *
     * @param intArray
     */
    public  static void printMultiDimensionalArray(int[][] intArray) {
        int i = 0;
        for (int[] subArray: intArray) {
            System.out.print(String.format("%1$-6s","[" + i + "]"));
            System.out.println(ArrayUtils.arrayToPaddedString(subArray, 8));

            i++;
        }
    }


}
