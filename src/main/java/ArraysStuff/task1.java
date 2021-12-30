package ArraysStuff;


public class task1 {
    public static void main(String[] args) {
        int n = 5;
        double[] myArray = new double[n];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random();
            System.out.println(myArray[i]);
        }

        double max = myArray[0];
        double min = myArray[0];
        double avg = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (max < myArray[i]){
                max = myArray[i];
            }
            if (min > myArray[i]){
                min = myArray[i];
            }
            avg += myArray[i]/myArray.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
