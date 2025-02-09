package section08;

import java.util.Arrays;

public class CalcArr {
    void sum(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int result = 0;
        for (int num : nums) {
            result += num;
        }

        System.out.println("총 합: " + result);
    }
}
