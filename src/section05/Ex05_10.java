package section05;

import java.util.Scanner;

public class Ex05_10 {
    public static void main(String[] args) {
        // Math.random(): 0<= 실수 타입 난수 <1
        int magicNumber = (int) (Math.random() * 5) + 1; // 1 <=난수 <11
        boolean isMatched = false;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("찾는 숫자를 입력>>");
            int guess = scan.nextInt();

            // System.out.println(guess);

            if(guess == magicNumber){
                System.out.println((i+1)+"번 만에 맞췄습니다.");
                isMatched=true;
                break;
            }else if (guess >magicNumber){
                System.out.println("맞춰야할숫자가 더 작습니다.");
            }else{
                System.out.println("맞춰야할 숫자가 더 큽니다.");
            }
        }
        if(!isMatched){
            System.out.println("정답을 맞추지 못했습니다.");
        }
        scan.close();
    }
}
