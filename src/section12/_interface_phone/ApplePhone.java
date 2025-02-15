package section12._interface_phone;

public class ApplePhone implements Phone {
    int batteryCapacity = 40;
    boolean isOn = false;

    @Override
    public void powerOn() {
        if (batteryCapacity > 30) {
            System.out.println("🍎Power On!!");
            isOn = true;
        } else {
            System.out.println("Low Battery ...");
        }
    }

    @Override
    public void powerOff() {
        System.out.println("🍎Power Off!!!");
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
            System.out.println("---charging---");
            batteryCapacity += 5;
            System.out.printf("Charged...%d%%\n", batteryCapacity);
        } else {
            System.out.println("You don't have to charge");
            System.out.println("It's enough... %d%%\n");
        }
    }

    @Override
    public void watchUtube() {
        if (batteryCapacity > 10) {
            System.out.println("---watching Utube---");
            batteryCapacity -= 10;
            System.out.printf("battery is... %d%%\n");
        } else {
            System.out.println("Low battery...");
            powerOff();
        }
    }
}
