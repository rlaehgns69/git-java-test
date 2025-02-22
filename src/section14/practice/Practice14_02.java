package section14.practice;

import java.util.Scanner;

public class Practice14_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int data = 0;
        int sum = 0;

        // 음수를 입력하면 "음수를 입력할 수 없습니다." 출력하고 count 횟수는 증가 시키지 않도록 하세요!
        while (count < 5) {
            try{

                System.out.print("숫자를 입력하세요:");
                data = scanner.nextInt();
    
                if (data < 0) {
                    throw new Exception("음수는 허용하지 않습니다.");
                }
                sum += data;
                count++;
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("숫자 합:" + sum);

        scanner.close();
    }
}
