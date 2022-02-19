package ForInterviews;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        System.out.println(firstUnique("pooppie"));
        System.out.println(firstUniqChar("pooppie"));
//        System.out.println("hey".toCharArray().toString());
    }
    public static int firstUnique(String word){
        char[] arr = word.toCharArray();
        int counting = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[0]){
                counting++;
            }
        }
        return counting;
    }


    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(characters.containsKey(current)) {
                characters.put(current, -1);
            } else {
                characters.put(current, i);
            }
        }

        int min = Integer.MAX_VALUE;
        for(char c: characters.keySet()) {
            if(characters.get(c) > -1 && characters.get(c) < min) {
                min = characters.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;

    }
}
