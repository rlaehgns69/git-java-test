package section12._interface_phone;

public class ThreeStarPhone implements Phone {
    int batteryCapacity = 50;
    boolean isOn = false;

    @Override
    public void powerOn() {
        if (batteryCapacity > 30) {
            System.out.println("⭐⭐⭐폰이 켜졌습니다.");
            isOn = true;
        } else {
            System.out.println("배터리가 부족합니다.");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("⭐⭐⭐폰이 꺼졌습니다.");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        if (isOn) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void charge() {
        if (batteryCapacity < Phone.MAX_BATTERY_CAPACITY) {
            System.out.println("---충전중---");
            batteryCapacity += 10;
        } else {
            System.out.println("충전할 필요가 없습니다.");
        }
        System.out.printf("잔여 배터리...%d%%\n", batteryCapacity);
    }

    @Override
    public void watchUtube() {
        if (batteryCapacity > 15) {
            System.out.println("---유튜브 시청중---");
            batteryCapacity -= 5;
            System.out.printf("잔여 배터리... %d%%\n", batteryCapacity);
        } else {
            System.out.println("배터리가 부족합니다...");
            powerOff();
        }
    }
}
