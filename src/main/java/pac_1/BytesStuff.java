package pac_1;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class BytesStuff {
    public static void main(String[] args) {

        crypto("123456789");
        String serzh = "ischxusidjd19383829";
         crypto(serzh);
    }
    public static void crypto(String password){

        int i;
        byte[] bytes = password.getBytes(StandardCharsets.UTF_8);
        for (i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] * 2);
        }
        System.out.println();
    }

//    int a = 55;
//    int b = 45;
//        System.out.println("a = " + Integer.toBinaryString(a) + "\n" + "b = " + Integer.toBinaryString(b));
//        System.out.println("bytes of new num = " + Integer.toBinaryString(a&b));
//        System.out.println("new num = " + (a&b));


}
class StringToByteArray {

    public static void main(String[] args) {
        String inputString = "f56ds86655f8";

        // преобразуем нашу строку в массив байт
        byte[] byteArray = inputString.getBytes();
        System.out.println("Строку в массив байт : " + Arrays.toString(byteArray));

        // конвертируем байты в строку
        String string = new String(byteArray);
        System.out.println("байты в строку : " + string);

        // давайте посмотрим, равны ли наши строки
        System.out.println("inputString == string : " + (inputString == string));
        System.out.println("inputString.equals(string) : " + (inputString.equals(string)));
    }

}

