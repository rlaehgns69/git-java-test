package section05;

public class Ex05_05 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;// 이 코드가 없으면 무한루프
            System.out.println(sum);
        }
    }

}
