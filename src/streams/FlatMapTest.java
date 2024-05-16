package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1);
        List<Integer> list2 = Arrays.asList(2,3);
        List<Integer> list3 = Arrays.asList(4,5,6);

        List<List<Integer>> main = new ArrayList<>();
        main.add(list1);
        main.add(list2);
        main.add(list3);
        System.out.println("Before -> " + main);

        List<Integer> derived = main.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println("After -> " + derived);
    }
}
