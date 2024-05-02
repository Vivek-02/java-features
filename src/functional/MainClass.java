package functional;

import java.util.function.Consumer;

public class MainClass {

    public static void main(String[] args) {
        // Testing functional interface
        int a = 5;
        Square s = (int x)->x*x;
        int ans = s.area(a);
        System.out.println(ans);

        // Testing Consumer FI
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        consumer.accept(5);
    }
}
