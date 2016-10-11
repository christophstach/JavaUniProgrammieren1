package Aufgabe07;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 29.06.16
 */
public class TestSearch {
    public static void main(String[] args) {
        Search search = new Search();

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] values = {1, 2, 6, 11, 16, 17};

        for(int i = 0; i < values.length; i++) {
            int res1 = search.linear(arr, values[i]);
            int res2 = search.binaryIterative(arr, values[i]);
            int res3 = search.binaryRecursive(arr, values[i]);
            System.out.printf(res1 == -1 ?  "Element %d mit linearer Suche nicht gefunden \n" : "Element %d an Index %d mit linearer Suche gefunden \n", values[i], res1);
            System.out.printf(res2 == -1 ?  "Element %d mit binärer iterativer Suche nicht gefunden \n" : "Element %d an Index %d mit binärer rekursiver Suche gefunden \n", values[i], res2);
            System.out.printf(res3 == -1 ?  "Element %d mit binärer rekursiver Suche nicht gefunden \n" : "Element %d an Index %d mit binärer rekursiver Suche gefunden \n", values[i], res3);
        }
    }
}
