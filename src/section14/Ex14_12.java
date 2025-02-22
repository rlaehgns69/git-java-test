package section14;

import java.util.Scanner;

import section14.custom.InputErrorException;

public class Ex14_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("당신의 나이를 입력하세요.>>");
            int age = scanner.nextInt();

            if (age < 0) {
                // throw new InputErrorException("음수 나이는 입력할 수 없습니다.");
                throw new InputErrorException();

            }

            if (age > 19) {
                System.out.println("성인입니다.");
            } else if (age > 13) {
                System.out.println("청소년입니다.");
            } else if (age > 6) {
                System.out.println("어린이입니다.");
            } else {
                System.out.println("아동입니다.");
            }
        } catch (InputErrorException e) {
            System.out.println(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
