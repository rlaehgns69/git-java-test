package section06;

import java.util.Arrays;

public class Ex06_10 {
    // 얕은 복사, 깊은 복사
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 1 };

        int[] arr2 = arr1; // stack 메모리의 "주소 값을 복사"하는 얕은 복사

        System.out.println(Arrays.toString(arr2));
        arr1[0] = 10;
        System.out.println(Arrays.toString(arr2)); // 얕은 복사 스택에 주소값만 복사하기 때문에 힙메모리에서 값이 아니라
    }
}
