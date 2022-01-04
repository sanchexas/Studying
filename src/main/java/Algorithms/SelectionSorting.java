package Algorithms;

import java.util.Arrays;

/**
 * Сортировка выбором. Выбор индекса элемента, с которого начинать сортировку массива поиском минимального
 * значения.
 */
public class SelectionSorting {
    public static void main(String[] args) {

        int[] a = {34,12,65,87,34,32,5};

        System.out.println("Минимальный элемент выбранного участка сортировки: " + minElement(a, 3));

    }

    public static int minElement(int[] array, int startSortingAt){

        int minEl = array[startSortingAt];
        int minId = startSortingAt;

        for (int i = startSortingAt + 1; i < array.length; i++) {
            if (array[i] < minEl){
                minEl = array[i];
                minId = i;
            }
        }
        return minEl;
    }
}
class SelectionSorting2{
    public static void main(String[] args) {

        int[] b = {21,23,54,23,6,23,7,34,65,8,12,43,2};
        System.out.println(findMinElInSelectedRange(b , 7));

    }
    public static int findMinElInSelectedRange(int[] array, int startSearchingAt){
        int minElement = array[startSearchingAt];
        for (int i = startSearchingAt + 1; i < array.length; i++) {
            if (array[i] < minElement ){
                minElement = array[i];
            }
        }
        return minElement;
    }
}
