package section15.practice;

import java.util.Scanner;

public class Practice15_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int matchValue = 0;
        int value = 0;

        matchValue = (int) (Math.random() * 30) + 1;
        // matchValue = (int) (Math.random() * 5) + 1;

        while (count < 10) {
            System.out.print("맞출 숫자 입력 : ");
            value = scanner.nextInt();

            count++;

            if (matchValue == value) {
                System.out.println("정답 : " + value + ", " + count + "번 만에 맞춤!");
                break;
            } else if (matchValue > value) {
                System.out.println("UP!");
            } else {
                System.out.println("DOWN!");
            }

            if (count == 10) {
                System.out.println("실패! 정답은 : " + matchValue + "입니다.");
            }

            
        }
        scanner.close();
    }
}
