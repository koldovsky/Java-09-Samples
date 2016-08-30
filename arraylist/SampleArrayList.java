package arraylist;

import java.util.ArrayList;
import java.util.List;

public class SampleArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer value: numbers) {
            System.out.println(value);
        }

        numbers.remove(0);

        // List interface
        List<Integer> numsList = new ArrayList<Integer>();
    }

}
