package pac_1;

public class Promote {
    // правила продвижения типов
    public static void main(String[] args) {
        byte b = 50;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d = .232;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println(result);

    // преобразование инт в байт
        int i1  = 300;
        byte b1;
        b1 = (byte) i1;
        System.out.println(b1 + " " + i1);
    }
}
