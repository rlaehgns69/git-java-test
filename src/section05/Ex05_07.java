package section05;

public class Ex05_07 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1){ // 홀수인 경우 실행
                continue; //continue 아래에 있는 코드를 실행하지 않는다.
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
