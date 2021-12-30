package ArraysStuff;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        //сортировка пузырьком
        int[] array = {40,50,10,30,20};
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }

            }

        }
        System.out.println(Arrays.toString(array));
    }
}
class Task2Practice{
    public static void main(String[] args) {
        int[] myArray = {12,65,32,76,23,1};
        boolean isSorted = false;
        int temp;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] > myArray[i+1]){
                    isSorted = false;
                    temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
