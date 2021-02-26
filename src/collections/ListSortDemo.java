package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("there");
        list.add("I");
        list.add("am");
        list.add("Vivek");

        List<String> list1 = list;

        Collections.sort(list);
        list.forEach(System.out::println);

        System.out.println();

        Collections.sort(list1, String::compareTo);
        list1.forEach(System.out::println);

    }

}
