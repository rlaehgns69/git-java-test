package section06;

import java.util.Arrays;

public class Ex06_14 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];// 행은 2 열은 3

        // for(int i = 0; i< arr.length; i++){
        // System.out.println(Arrays.toString(arr[i]));
        // }

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 11;
        arr[1][1] = 22;
        arr[1][2] = 33;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
