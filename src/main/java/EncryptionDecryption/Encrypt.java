package EncryptionDecryption;

public class Encrypt {
    public static void main(String[] args) {
        int key = 6;
        String text = "Hi, how are you?";
        char[] chars = text.toCharArray();
        for (char c :  chars){
            c+=key;
            System.out.print(c);
        }
        System.out.println("\n" + text);
    }
}
