package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExceptionExample {

    // throws 사용
    // 1. 해당 메서드를 호출하는 쪽에서 예외 처리를 고려하도록 유도
    // 2. 메서드를 사용하는 쪽에서 명시적으로 어떤 예외가 발생할 수 있는지 알려줌.
    public static void checkYourSelf(Scanner scanner) throws InputMismatchException {
        System.out.println("1. 사람과 어울리는 것이 좋다. 2. 혼자 있는 것이 좋다.");
        System.out.print("선택 >>");

        // 1.checkYourelf 메서드 내에서 예외 처리한 경우
        // try {

        // int check = scanner.nextInt();

        // if (check == 1) {
        // System.out.println("당신은 E입니다.");
        // } else {
        // System.out.println("당신은 I입니다.");
        // }
        // } catch (InputMismatchException e) {
        // System.out.println("키보드 입력이 잘못되었습니다.");
        // }
        // checkYourSelf 메서드에서 예외를 던지는 경우

        int check = scanner.nextInt();

        if (check == 1) {
            System.out.println("당신은 E입니다.");
        } else {
            System.out.println("당신은 I입니다.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 성격 유형 검사를 시작합니다.");

        try {
            ThrowsExceptionExample.checkYourSelf(scanner);
        } catch (InputMismatchException e) {
            System.out.println("키보드 입력이 잘못 되었습니다.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }

        }

        // ThrowsExceptionExample.checkYourSelf(scanner);

        // if (scanner != null) {
        // scanner.close();
        // }

        // System.out.println("프로그램 종료!");
    }
}
