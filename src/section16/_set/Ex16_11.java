package section16._set;

import java.util.HashSet;
import java.util.Set;

public class Ex16_11 {
    public static void main(String[] args) {
        // HahsSet<String> set = new HashSet<String>();
        Set<String> set = new HashSet<String>();

        set.add("apple");
        set.add("MANGO"); // Set은 순서가 업ㅄ음.
        set.add("banana");
        set.add("banana");
        set.add("banana");
        set.add("banana");
        set.add("banana");
        set.add("banana"); // 중복 허용 안됨.

        set.remove("banana");
        System.out.println(set);

        Set<Integer> example = new HashSet<Integer>();

        int[] arr = { 1, 2, 3, 43, 1, 23, 35, 1, 1, 2, 1, 2, 3, 43, 1, 23, 35, 1, 1, 2, 1, 2, 3, 43, 1, 23, 35, 1, 1,
                2 };

        for (int num : arr) {
            example.add(num);
        }
        System.out.println(example);

        /*
         * example.add(1);
         * example.add(2);
         * example.add(3);
         * example.add(4);
         * example.add(5);
         * example.add(1);
         * example.add(2);
         * example.add(5);
         * example.add(2);
         * example.add(3);
         * example.add(10);
         * 
         * System.out.println(example);
         */

    }
}
