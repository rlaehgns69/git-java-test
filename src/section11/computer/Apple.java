package section11.computer;

public class Apple extends Computer {
    @Override
    void powerOn() {
        super.powerOn();
        // 이모지 win+.
        System.out.println("🍎");
    }

}
