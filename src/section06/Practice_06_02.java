package section06;

public class Practice_06_02 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
                System.out.println(arr[i]);
                continue;
            }
            System.out.printf("홀수%d:%d", i, arr[i]);
            System.out.println();
        }
        System.out.println(sum);
    }
}
