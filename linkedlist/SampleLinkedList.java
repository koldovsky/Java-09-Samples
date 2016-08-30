package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList {
    public static void main(String[] args) {
        List<Integer> numsArrayList = new ArrayList<>();
        List<Integer> numsLinkedList = new LinkedList<>();

        CompareLists(numsArrayList);
        CompareLists(numsLinkedList);

    }

    private static void CompareLists(List<Integer> list) {
        final int iterations = 500000;

        long start = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(String.format("Adding to end %s Time taken: %d ms", list.getClass().getName(), end - start ));

        start = System.currentTimeMillis();
        for (int i = iterations - 1; i >= 0; i--) {
            list.remove(i);
        }
        end = System.currentTimeMillis();
        System.out.println(String.format("Removing from the end %s Time taken: %d ms", list.getClass().getName(), end - start ));

        start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            list.add(0, i);
        }
        end = System.currentTimeMillis();
        System.out.println(String.format("Adding to start %s Time taken: %d ms", list.getClass().getName(), end - start ));


        start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            list.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.println(String.format("Removing from the start %s Time taken: %d ms", list.getClass().getName(), end - start ));

    }
}
