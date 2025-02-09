package section06;

public class Ex06_02 {
    public static void main(String[] args) {
        int[] arr = new int[4]; // 배열의 길이 앞에 적용 x 문법에러

        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);

        System.out.println();
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.print(arr[3]);
        // System.out.print(arr[4]); 주의 index out of bounds

        System.out.println();

        System.out.println(arr.length); // 배열의 길이
    }
}
