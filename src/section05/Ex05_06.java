package section05;

public class Ex05_06 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        do{
            sum += i;
            i++;// 이 코드가 없으면 무한루프
            System.out.println(sum);
        }while (i <= 10);
    }
}
