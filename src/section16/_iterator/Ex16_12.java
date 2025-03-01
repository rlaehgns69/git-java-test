package section16._iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex16_12 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        List<Integer> list = new ArrayList(Arrays.asList(arr));

        Iterator<Integer> iter = list.iterator();

        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.next());
        // System.out.println(iter.next()); // java.util.NosuchElementException

        
        System.out.println(iter.hasNext());
        
        List<String> list2 = Arrays.asList("a","b","c");

        Iterator<String> iter2 = list2.iterator();
        while (iter2.hasNext()) {
            System.out.println(iter2.next());
        }
    }
}
