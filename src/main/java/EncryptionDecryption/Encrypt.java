package EncryptionDecryption;

public class Encrypt {
    public static void main(String[] args) {
        int key = 4;
        String text = "'][]'13568765zxqg[;.,!";
        char[] chars = text.toCharArray();
        for (char c : chars){
            c+=key;
            System.out.print(c);
        }
        System.out.println("\n" + text);
    }
}
