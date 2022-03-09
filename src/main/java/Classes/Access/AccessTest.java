package Classes.Access;

public class AccessTest {
    public static void main(String[] args) {
        Test t = new Test();

        t.setSecond(30);
        t.b = 23;
        t.first = 42;

        System.out.println(t.getSecond());
    }
}
