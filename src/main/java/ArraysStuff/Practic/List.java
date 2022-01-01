package ArraysStuff.Practic;

import java.util.ArrayList;
/**
* Hello!
 */
public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Warning");
        list.add("Love");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == 'o'){
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
class FindWord{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hey!");
        arrayList.add("Adriana");
        arrayList.add("Because");
        arrayList.add("Morning");
        arrayList.add("Afternoon");

        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.get(i).length(); j++) {
                if (arrayList.get(i).charAt(j) == 'a' || arrayList.get(i).charAt(j) == 'A'){
                    System.out.println(arrayList.get(i));
                }
            }
        }
    }
}
class FindWord2{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("wow");
        list.add("no");
        list.add("hi");
        list.add("ass");

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == 'o'){
                    //System.out.println(list.get(i));

                }
            }
        }
    }
}
