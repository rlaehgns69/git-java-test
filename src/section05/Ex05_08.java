package section05;

public class Ex05_08 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 홀수만
            // if (i % 2 != 0) {
            // System.out.println(i);
            // }
            // if (i % 2 == 0) {
            // continue;
            // }
            // System.out.println(i);
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}
