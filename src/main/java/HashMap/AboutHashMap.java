package HashMap;

import java.util.HashMap;

public class AboutHashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> myHash = new HashMap<String, Integer>();
        myHash.put("a", 34);
        myHash.put("b", 23);
        myHash.put("c", 12);

        System.out.println(myHash);

        HashMap<String, Integer> age = new HashMap<String, Integer>();
        age.put("Sergey", 19);
        age.put("Alexandr", 19);
        age.put("Pavel", 20);

        System.out.println(age);
        System.out.println(age.get("Sergey"));
    }
}
