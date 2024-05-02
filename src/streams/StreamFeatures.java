package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFeatures {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());

        List<String> names = Arrays.asList("Vivek","Verma","Bhavana","Gutta");
        List<String> filtered = names.stream().filter(s -> s.startsWith("V")).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
