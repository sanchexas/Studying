package Algorithms;

/**
 * Тренировка.
 * Нахождение минимального элемента в массиве.
 */

public class FindMinElInArray {
    public static void main(String[] args) {
        int[] array = {30,34,76,12,45,68,22};
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("Minimal value: " + minValue);
        System.out.println("Index of minimal value:" + minIndex);
    }
}
