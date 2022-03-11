package OOP.Inheritance;

public class B extends A{
    int k;

    void printK(){
        System.out.println("k = " + k);
    }
    public int sum(){
        return a + b + k;
    }
}
