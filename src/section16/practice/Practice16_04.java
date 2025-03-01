package section16.practice;

import java.util.ArrayList;
import java.util.List;

public class Practice16_04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int value = (int) (Math.random() * 100) + 1;
            list.add(value);
        }
        System.out.println(list);

        int sum = 0;
        for (int num : list) {
            if (num % 2 == 0)
                sum += num;
        }
        System.out.println(sum);
    }
}
