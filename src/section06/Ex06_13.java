package section06;

import java.util.Arrays;

public class Ex06_13 {
    // 얕은 복사, 깊은 복사
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 1 };

        int[] arr2 = new int[4];

        System.out.println("arr2 : " + Arrays.toString(arr2));

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        arr1[0] = 10;

        System.out.println("arr1 : " + Arrays.toString(arr1));
        System.out.println("arr2 : " + Arrays.toString(arr2));

    }
}
