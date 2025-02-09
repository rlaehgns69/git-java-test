package section08;

public class CalcReturn {
    int sum(int[] nums) {
        
        int result = 0;
        for (int num : nums) {
            result += num;
        }

        return result;
    }
}
