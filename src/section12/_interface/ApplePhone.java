package section12._interface;

public class ApplePhone implements Phone {
    int batterCapacity = 40;
    boolean isOn = false;

    @Override
    public void powerOn() {
        if (batterCapacity > 30) {
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

}
