package section06;

import java.util.Arrays;

public class Ex06_12 {
    // 얕은 복사, 깊은 복사
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 1 };

        int[] arr2 = Arrays.copyOf(arr1, arr1.length); // 깊은 복사

        System.out.println("arr2 : " + Arrays.toString(arr2));

        arr1[0] = 10;

        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

    }
}
