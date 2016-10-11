package Aufgabe8;

import java.util.Arrays;

/**
 * Name: Christoph Stach
 * Matrikel-Nr: 555912
 * Datum: 21.06.16
 */
public class TestUniversityArray {
    public static void main(String[] args) {
        UniversityArray uniArray = new UniversityArray();

        double[] doubleArray = {1.5, 2.7, 3.5};
        int[] intArray = {1, 2, 3, 4, 5};
        int[][] intArrayMulti = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println(ArrayUtils.arrayToString(doubleArray));
        System.out.println(ArrayUtils.arrayToString(uniArray.reverseArray(doubleArray)));
        System.out.println(Double.toString(uniArray.average(doubleArray)));
        System.out.println(Integer.toString(uniArray.differenceMinMax(intArray)));
        uniArray.printMultiDimensionalArray(intArrayMulti);
    }
}
