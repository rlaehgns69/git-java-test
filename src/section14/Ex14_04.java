package section14;

public class Ex14_04 {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
            System.out.println("나누기 결과" + result);

        } catch (ArithmeticException e) {
            System.out.println("입력하신 내용을 계산할 수 없습니다.");
        }

    }

}
