package pac_1;

import java.nio.charset.StandardCharsets;

public class BytesStuff {
    public static void main(String[] args) {
       int a = 55;
       int b = 45;
        System.out.println("a = " + Integer.toBinaryString(a) + "\n" + "b = " + Integer.toBinaryString(b));
        System.out.println("bytes of new num = " + Integer.toBinaryString(a&b));
        System.out.println("new num = " + (a&b));

    }

}
