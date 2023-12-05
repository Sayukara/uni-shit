/*
    Aufgabe 3) Eindimensionale Arrays und Methoden
*/

import java.util.Arrays;
import java.util.Random;

public class Aufgabe3 {

    private static int[] genRandomArray(int length, int maxNumber) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        int random = 0;
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                random = (int) Math.round(Math.random()*maxNumber);
            }

            arr[i] = random + i%3;
        }
        return arr;
    }

    private static void replaceValues(int[] workArray, int idx) {
        //TODO: Implementieren Sie hier Ihre Lösung für die Angabe
        int mittelwert = 0;
        int sum = 0;
        int min, max = 0;
        for (int x:workArray) {
            sum+=x;
            if (max <= x)
                max = x;
        }
        min = max;
        for (int x:workArray) {
            if (min >= x)
                min = x;
        }
        mittelwert = sum/workArray.length;
        for (int i = 0; i <= idx; i++) {
            if (workArray[i] >= mittelwert)
                workArray[i] = max;
            if (workArray[i] < mittelwert)
                workArray[i] = min;
        }

    }

    public static void main(String[] args) {
        int[] array1 = genRandomArray(21, 50);
        System.out.println(Arrays.toString(array1));
        System.out.println();

        int[] array2 = new int[]{12, 3, 15, 18, 22, 9, 5, 8, 16, 21};
        replaceValues(array2, 4);
        System.out.println(Arrays.toString(array2));
        assert (Arrays.equals(array2, new int[]{22, 3, 22, 22, 22, 9, 5, 8, 16, 21}));

        int[] array3 = new int[]{12, 3, 15, 18, 22, 9, 5, 8, 16, 21};
        replaceValues(array3, 9);
        System.out.println(Arrays.toString(array3));
        assert (Arrays.equals(array3, new int[]{22, 3, 22, 22, 22, 3, 3, 3, 22, 22}));

        int[] array4 = new int[]{21, 14, 12, 17};
        replaceValues(array4, 2);
        System.out.println(Arrays.toString(array4));
        assert (Arrays.equals(array4, new int[]{21, 12, 12, 17}));

        int[] array5 = new int[]{3, 4, 6, 7};
        replaceValues(array5, 2);
        System.out.println(Arrays.toString(array5));
        assert (Arrays.equals(array5, new int[]{3, 3, 7, 7}));

        int[] array6 = new int[]{7, 7};
        replaceValues(array6, 1);
        System.out.println(Arrays.toString(array6));
        assert (Arrays.equals(array6, new int[]{7, 7}));

        int[] array7 = new int[]{3, 2, 1};
        replaceValues(array7, 2);
        System.out.println(Arrays.toString(array7));
        assert (Arrays.equals(array7, new int[]{3, 3, 1}));

        int[] array8 = new int[]{1};
        replaceValues(array8, 0);
        System.out.println(Arrays.toString(array8));
        assert (Arrays.equals(array8, new int[]{1}));
    }
}
