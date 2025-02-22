package section14;

import java.util.Scanner;

public class Ex14_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int val = 0;

        while (true) {
            try {

                System.out.print("숫자를 입력하세요.(0~50)");
                val = scanner.nextInt();

                if (val == -1) {
                    break;
                }
                // throw new를 이용해 예외 인스턴스 생성하여 예외를 일으킴.
                // 코드 작성자가 의도적(고의)으로 예외를 일으킴.
                // 예) 나이: 음수 나이는 있을 수 없음.
                if (val < 0 || val > 50) {
                    // System.out.println("숫자 허용범위가 아닙니다.");
                    throw new Exception("숫자 허용 범위가 아닙니다.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        System.out.println("프로그램 종료!");
    }
}
