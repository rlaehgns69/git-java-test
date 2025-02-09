package section05;

public class Ex05_02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("전체 합 : " + sum);

        sum = 0;

        for (int i = 1; i <= 100; i++) {
            // System.out.println(i+":"+i % 2);
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("짝수 합 : " + sum);

        sum = 0;
        // 반복문에서 변수명 i 사용 이유
        // - 관례적
        // - index
        // - i, j, k...
        for (int a = 1; a <= 100; a++) {
            // System.out.println(i+":"+i % 2); 코드 정렬 vscode alt + shift + f
            if (a % 2 == 1) { // i % 2 != 0
                sum += a;
            }
        }

        System.out.println("홀수 합 : " + sum);
    }
}
