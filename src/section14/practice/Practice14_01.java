package section14.practice;

public class Practice14_01 {
    public static void main(String[] args) {
        int data = 10;
        double result = 0;

        try {
            result = data / 0;

        } catch (ArithmeticException e) {
            // System.out.println("0으로는 나눌 수 없습니다.");
            result = 0;
        }

        System.out.println("결과는 :" + result);
    }
}
