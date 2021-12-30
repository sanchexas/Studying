package ArraysStuff.Practic;

public class PrDoubleArray {
    public static void main(String[] args) {
        int[][] double_array = new int[6][6];
        int z = 0;

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                double_array[i][j] = z;
                z++;
            }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++)
                System.out.print(double_array[i][j] + " ");
                System.out.println();

        }

    }
}
