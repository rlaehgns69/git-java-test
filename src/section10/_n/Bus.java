package section10._n;

public class Bus extends Car {
    int peopleNum;

    Bus(int peopleNum) {
        this.peopleNum = peopleNum;
    }

    void takePerson() {
        System.out.println("승객이 버스에 탔습니다.");
        peopleNum++;
        System.out.println("지금까지 탑승한 승객은 " + peopleNum +
        "입니다.");
    }
}
