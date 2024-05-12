package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFeatures {

    public static void main(String[] args) {
        StreamFeatures streamFeatures = new StreamFeatures();
        streamFeatures.testStreamsGroupBy();
    }

    private void testStreamsGroupBy() {
        Map<String, String> map = new HashMap<>();
        map.put("Jordan","A+");
        map.put("Messi","B+");
        map.put("Ronaldo","O+");
        map.put("Maradona","A+");
        map.put("Dhoni","B+");
        map.put("Virat","A+");
        map.put("Siraj","B+");
        map.put("Sami","O+");
        map.put("Pujara","O+");
        map.put("Agarkar","A+");
        Arrays.asList("");
        Map<String,List<String>> groupByBloodGroupMap = map.keySet().stream()
                .collect(Collectors.groupingBy(map::get));

        System.out.println(groupByBloodGroupMap);
    }

    public void testSampleMapAndPredicate() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("Vivek","Verma","Bhavana","Gutta");
        List<String> filtered = names.stream().filter(s -> s.startsWith("V")).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
