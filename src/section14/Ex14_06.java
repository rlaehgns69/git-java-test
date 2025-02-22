package section14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex14_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cards = { 4, 5, 1, 2, 7, 8 };
        System.out.println("몇 번째 카드를 뽑으시겠습니까? >>");

        try {

            int cardIndex = scanner.nextInt();
            System.out.println("뽑은 카드 번호는 :" + cards[cardIndex - 1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("해당 번호의 카드는 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("숫자형식을 입력해주세요.(잘못입력하셨습니다.)");
            // 순서 주의! 상위 예외 클래스
        } catch (RuntimeException ex) {
            System.out.println("실행 중에 알 수 없는 문제가 발생했습니다.");
        } catch (Exception e) {
            System.out.println("알 수 없는 문제가 발생했습니다.");
        } finally {
            System.out.println("프로그램 종료");
            scanner.close();
        }

    }
}
