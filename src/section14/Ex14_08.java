package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("점수를 입력하세요 >>>");
            int score = scanner.nextInt();

            if (score >= 60) {
                System.out.println("합격입니다.");
            } else {
                System.out.println("불합격입니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("키보드 입력이 올바르지 않습니다.");
        } finally {
            scanner.close();
            System.out.println("프로그램 종료");

        }

    }
}
