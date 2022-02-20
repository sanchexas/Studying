package Lambda;

public class Lambda {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 123.2;
        System.out.println(myNumber.getValue());
        myNumber = () -> Math.random() * 21.2;
        System.out.println(myNumber.getValue());
    }

}
