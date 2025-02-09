package section06;

import java.util.Arrays;

public class Ex06_06 {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 2, 4, 1 };

        // System.out.println(arr[0] + " " + arr[1]);

        // int tmp = arr[0];
        // arr[0] = arr[1];
        // arr[1] = tmp;
        // System.out.println(arr[0] + " " + arr[1]);

        int temp = 0;
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr));

        System.out.println();
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // for(int i = 0; i<arr.length; i++){
        // System.out.print(arr[i]+ " ");
        // }
        System.out.println(Arrays.toString(arr));

    }
}
