package section05;

public class Practice_05_03 {
    public static void main(String[] args) {
        // 1. 1~100 짝수합?
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // if (i % 2 == 0) {
            // sum += i;
            // }
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }

        System.out.println("1~100까지 정수 중 짝수합: " + sum);

    }
}
