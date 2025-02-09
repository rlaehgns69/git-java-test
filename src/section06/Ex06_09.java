package section06;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06_09 {
    public static void main(String[] args) {
        Integer[] arr = { 5, 3, 2, 4, 1 }; // 내림차순 Integer클래스 사용(Wrapper 클래스)

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Comparator.reverseOrder()); // 내림차순 정렬 인수추가 Comparator reverseorder

        System.out.println(Arrays.toString(arr));
    }
}
