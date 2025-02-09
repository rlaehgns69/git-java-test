package section08;

public class Bus {
    void take(int money) {
        while (true) {
            if (money < 3000) {
                System.out.println("교통카드를 충전하러 갑니다.");
                return; // break;
            }
            System.out.println("버스를 탑니다.");
            money -= 1300;
        }
    }
}
