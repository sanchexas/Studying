package ArraysStuff;

public class task3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            //System.out.println(i);
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
               // System.out.print(j +" ");
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");

            }
        }
    }
}
