package Algorithms;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] array = {2,1,4,7,3,5,8,6,10,9};

        System.out.println("Before sorting: " + Arrays.toString(array));

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
