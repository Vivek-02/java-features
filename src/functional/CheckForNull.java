package functional;


import java.util.function.Predicate;

/**
 * A function which accepts an argument and returns a boolean value
 */
public class CheckForNull implements Predicate {

    @Override
    public boolean test(Object o) {
        return o==null;
    }
}
