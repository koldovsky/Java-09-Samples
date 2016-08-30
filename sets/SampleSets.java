package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SampleSets {
    public static void main(String[] args) {

        // HashSet does not retain order
        Set<String> set1 = new HashSet<>();

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        set1.add("mouse");

        System.out.println(set1.getClass().getName() + ": " + set1);

        // HashSet retain order
        Set<String> set2 = new LinkedHashSet<>();

        set2.add("dog");
        set2.add("cat");
        set2.add("mouse");
        set2.add("snake");
        set2.add("bear");

        set2.add("mouse");

        System.out.println(set2.getClass().getName() + ": " + set2);

        //TreeSet sorts in natural order
        Set<String> set3 = new TreeSet<>();

        set3.add("dog");
        set3.add("cat");
        set3.add("mouse");
        set3.add("snake");
        set3.add("bear");

        set3.add("mouse");

        System.out.println(set3.getClass().getName() + ": " + set3);

        // Iteration
        for (String element: set1) {
            System.out.println(element);
        }

        //Check if contains element
        if (set1.contains("dog")) {
            System.out.println("set1 contains dog");
        }
    }
}
