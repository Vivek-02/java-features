package functional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class MainClass {

    public static void main(String[] args) {
        // Testing functional interface
        MainClass mainClass = new MainClass();
        int[] people = {3,2,2,1};
        System.out.println(mainClass.numRescueBoats(people,3));
    }

    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum = 0;
        int i = 0;
        int j = people.length-1;
        int count = 0;
        Set<Integer> set = new HashSet<>();

        while(i < j) {
            sum = people[i] + people[j];
            if(sum<=limit) {
                sum=0;
                count++;
                set.add(i);
                set.add(j);
                i++;
                j--;
            } else if(sum>limit) {
                sum = 0;
                j--;
            }
        }

        for(int k=i;k<people.length;k++) {
            if(!set.contains(k))
                count++;
        }

        return count;
    }
}
