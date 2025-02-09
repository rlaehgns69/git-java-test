package section09;

public class Snack {
    int price;

    void info() {
        System.out.println("과자의 가격은 " + price + "원입니다.");
    }

    Snack() {
    }// 기본생성자: 작성하지 않아도 자동 생성됨.

    Snack(int p) {
        price = p;
    }
}
