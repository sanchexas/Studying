package Arguments;

public class VarArgs {
    public static void main(String[] args) {
        vaTest(10,23,54,12,65,23,67,45,23,1,4,6);
    }
    static void vaTest(int ... v){
        for (int x : v){
            System.out.print(x + " ");
        }
    }
}
