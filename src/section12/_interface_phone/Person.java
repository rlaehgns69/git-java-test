package section12._interface_phone;

public class Person {
    Phone p;

    Person(Phone p) {
        this.p = p;
    }

    void buyNewPhone(Phone p) {
        this.p = p;
        System.out.println("-----------------");
        System.out.println("새 폰을 샀습니다!");
    }

    void turnOnPhone() {
        p.powerOn();
    }

    void turnOff() {
        p.powerOff();
    }

    void watchUtube() {
        if (p.isOn()) {
            p.watchUtube();
        } else {
            System.out.println("폰이 꺼져 있기 때문에 유튜브를 볼 수 없습니다.");
        }
    }

    void charge() {
        p.charge();
    }
}
