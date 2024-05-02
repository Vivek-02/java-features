package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        PredicateExample predicateExample = new PredicateExample();
        predicateExample.stringPredicate();
        predicateExample.integerPredicate();
    }

    public void stringPredicate() {
        List<String> list = Arrays.asList(
                "Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        // Setting predicate string logic
        Predicate<String> predicate = (s) -> s.startsWith("G");
        Consumer<String> consumer = System.out::println;
        for(String str : list) {
            if(predicate.test(str))
                consumer.accept(str);
        }
    }

    public void integerPredicate() {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        // Setting predicate integer logic
        Predicate<Integer> predicate = (i) -> i%2==0;
        Consumer<Integer> consumer = System.out::println;

        for(int k : list){
            if(predicate.test(k))
                consumer.accept(k);
        }
    }
}
