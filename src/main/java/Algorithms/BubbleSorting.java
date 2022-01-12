package Algorithms;

import java.util.Arrays;

/**
 * Сортировка пузырьком. Просто тренируюсь.
 */
// САША ПИДОР :)
//Сам ты пидор ;)
    
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
class BubbleSortingTraining{
    public static void main(String[] args) {

        int[] a = {4,2,6,5,7,3,1,9,8,10};
        System.out.println(Arrays.toString(bubbleSorting(a)));
    }

    public static int[] bubbleSorting(int[] array){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]){
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return array;
    }
}
class BubbleSortingTraining2{
    public static void main(String[] args) {
        int[] a = {8,3,4,1,6,2,9,7,5,10};
        System.out.println(Arrays.toString(bubbleSorting(a)));
    }

    public static int[] bubbleSorting(int[] array){

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
        return array;
    }
}
