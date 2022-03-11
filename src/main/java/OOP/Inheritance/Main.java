package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.a = 10;
        superOb.b = 4;
        superOb.printAB();
        subOb.a = 11;
        subOb.b = 3;
        subOb.k = 7;
        subOb.printAB();
        subOb.printK();
        int result = subOb.sum();
        System.out.println("result = " + result);
    }
}
