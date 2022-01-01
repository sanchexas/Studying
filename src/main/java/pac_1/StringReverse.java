package pac_1;

public class StringReverse {
    public static void main(String[] args) {
        reverseString("hello");
    }
    public static String reverseString(String str){
        char[] chars = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        return str;
    }
}
class StringReverse2{
    public static void main(String[] args) {
        reverse("bich");
    }
    public static String reverse(String s){
        char[] c = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        return s;
    }
}
