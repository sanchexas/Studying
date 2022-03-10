package Arguments;

public class MathodsOverload {
    public static void main(String[] args) {
        vaTest(false,true,false,true);
        vaTest(1,22,3,65,76,34,67);
        vaTest("W","O","W","!");
    }
    static void vaTest(int ... ints){
        for(int x : ints){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(String ... strings){
        for(String x : strings){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... b){
        for(boolean x : b){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
