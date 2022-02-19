package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiPractice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        Stream stream = list.stream();
        stream.filter(x-> x.toString().length() == 3).forEach(System.out::println);
    }
}
