package EncryptionDecryption;

public class Encrypt {
    public static void main(String[] args) {

        String text = "Hi, how are you?";
        char[] chars = text.toCharArray();
        for (char c :  chars){
            c+=5;
            System.out.println(c);
        }
        System.out.println(text);
    }
}
