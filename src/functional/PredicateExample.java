package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        for(String str : list) {
            if(predicate.test(str))
                System.out.println(str);
        }
    }

    public void integerPredicate() {
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        // Setting predicate integer logic
        Predicate<Integer> predicate = (i) -> i%2==0;

        for(int k : list){
            if(predicate.test(k))
                System.out.println(k);
        }
    }
}
