package section06;

import java.util.Arrays;

public class Ex06_08 {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 2, 4, 1 };

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
