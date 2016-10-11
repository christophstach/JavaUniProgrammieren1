package Aufgabe07;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 29.06.16
 */
public class Search {
    /**
     * Aufgabe 11.5 :: Lineare Suche in einem sortierten Array
     * Die Linare suche geht einfach jedes Element des Arrays nacheinander per Schleife durch und gibt im Falle eines
     * Treffers den Index zurück. Bei keinem Treffer wird -1 zurückgegeben.
     *
     * @param arr
     * @param value
     * @return
     */
    public int linear(int[] arr, int value) {
        int index = -1, i = 0;

        if(arr != null) {
            while (index == -1 && i < arr.length) {
                if(arr[i] == value) {
                    index = i;
                }

                i++;
            }
        }

        return index;
    }

    /**
     * Aufgabe 11.6 :: Binäre Suche
     * Start und Ende bestimmt jeweils den Unterbereich des Arrays der durchsucht werden soll. Dieser wird immer halbiert.
     * Die Größe wird jedes mal halbiert. Je nach dem ob der Wert des Arrays an der Stelle des Pivot Elements größer oder kleiner
     * des Suchwertes ist, wird entweder Start erhöht oder Ende verringert.
     *
     * @param arr
     * @param value
     * @return
     */
    public int binaryIterative(int[] arr, int value) {
        if(arr != null) {
            int index = -1, i = 0, start = 0, end = arr.length - 1, pivot;

            while (index == -1 && start <= end) {
                pivot = (start + end) / 2;

                if (arr[pivot] == value) {
                    index = pivot;
                } else if (value < arr[pivot]) {
                    end = pivot - 1;
                } else if (value > arr[pivot]) {
                    start = pivot + 1;
                }
            }

            return index;
        } else {
            return -1;
        }
    }


    /**
     * Aufgabe 11.6 :: Binäre Suche
     * Überladene Methode mit sinnvollen Startwerten.
     *
     * @param arr
     * @param value
     * @return
     */
    public int binaryRecursive(int[] arr, int value) {
        return this.binaryRecursive(arr, value, 0, arr.length - 1);
    }

    /**
     * Aufgabe 11.6 :: Binäre Suche
     * Setzt das Pivot-Element auf die Hälfte von Start und Ende.
     * Danach wird überprüft ob der Value mit dem Wert im Array übereinstimmt. Wenn ja ist die Suche beendet.
     * Wenn Nein wird je nach voll entweder der Obere Teil bzw. der Untere Teil des Arrays erneut überprüft.
     *
     * @param arr
     * @param value
     * @param start
     * @param end
     * @return
     */
    public int binaryRecursive(int[] arr, int value, int start, int end) {
        if (arr != null) {
            int pivot = (start + end) / 2;

            if (start >= 0 && end < arr.length) {
                if (arr[pivot] == value) {
                    return pivot;
                } else if (value > arr[pivot] && start <= end) {
                    return this.binaryRecursive(arr, value, pivot + 1, end);
                } else if (value < arr[pivot] && start <= end) {
                    return this.binaryRecursive(arr, value, start, pivot - 1);
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
