package section12._interface_phone;

public class Ex12_14 {
    public static void main(String[] args) {
        // ApplePhone applePhone = new ApplePhone();
        // Person kim1 = new Person(applePhone);
        Person kim1 = new Person(new ApplePhone());
        kim1.turnOnPhone();
        for (int i = 1; i < 6; i++) {
            kim1.watchUtube();

            if (i % 2 == 0) {
                kim1.chargePhone();
            }
        }
        
        System.out.println();

        kim1.buyNewPhone(new ThreeStarPhone());
        kim1.turnOnPhone();
        for (int i = 1; i < 6; i++) {
            kim1.watchUtube();

            if (i % 2 == 0) {
                kim1.chargePhone();
            }
        }
    }
}
