package section06;

public class Ex06_17 {
    public static void main(String[] args) {
        int[] score = { 90, 91, 92 };

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        System.out.println();
        // 향상된 for문
        for (int s : score) {
            System.out.println(s);
        }
        int sum = 0;
        System.out.println();
        // 향상된 for문
        for (int s : score) {
            sum += s;
        }
        System.out.println(sum);
    }
}
