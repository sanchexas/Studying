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

        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("Bob", "pa$$w0rd");
        fun.put("Raymond", "PubeWhore2000");
        System.out.println(fun.containsKey("Bob"));
        System.out.println(fun.containsValue("pa$$w0rd"));

        if (!fun.containsValue("pa$$w0rd")){
            System.out.println("Such a value doesn't exist!");
        }else
            System.out.println("Yay! That's right!");

        System.out.println(fun);
        System.out.println(fun.replace("Bob", "123456"));   //replaced password :)
        System.out.println(fun);

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"A");
        hashMap.put(2,"B");
        hashMap.put(3,"C");
        hashMap.put(4,"D");

        System.out.println(hashMap);
    }
}
