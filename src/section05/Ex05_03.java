package section05;

public class Ex05_03 {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            // System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %d\t", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            // System.out.println(i + "단");
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d X %d = %d\t", j, i, i * j);
                // System.out.println();
            }
            System.out.println();
        }
        // 특수문자 사용 단축키 win + .
        for (int i = 2; i <= 9; i++) { // 바깥 for문 유지 (2단부터 9단까지)
            System.out.println(i + "단");
            // 안쪽 for문 대신 하드코딩
            System.out.println(i + " x 1 = " + (i * 1));
            System.out.println(i + " x 2 = " + (i * 2));
            System.out.println(i + " x 3 = " + (i * 3));
            System.out.println(i + " x 4 = " + (i * 4));
            System.out.println(i + " x 5 = " + (i * 5));
            System.out.println(i + " x 6 = " + (i * 6));
            System.out.println(i + " x 7 = " + (i * 7));
            System.out.println(i + " x 8 = " + (i * 8));
            System.out.println(i + " x 9 = " + (i * 9));
            System.out.println(); // 단 간격 띄우기
        }
        for (int i = 1; i <= 9; i++) { // 1부터 9까지 반복
            // 각 i값에 대해 2단부터 9단까지 곱셈 수행
            System.out.println("2 x " + i + " = " + (2 * i));
            System.out.println("3 x " + i + " = " + (3 * i));
            System.out.println("4 x " + i + " = " + (4 * i));
            System.out.println("5 x " + i + " = " + (5 * i));
            System.out.println("6 x " + i + " = " + (6 * i));
            System.out.println("7 x " + i + " = " + (7 * i));
            System.out.println("8 x " + i + " = " + (8 * i));
            System.out.println("9 x " + i + " = " + (9 * i));
            System.out.println(); // 간격 띄우기
        }
        // System.out.println();
    }
}
