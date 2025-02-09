package section11.bike;

public class FourWheelBike extends Bike {

    FourWheelBike(String riderName) {
        super(riderName);
    }

    @Override
    void info() {
        super.info();
    }

    @Override
    void ride() {
        System.out.println(wheel + "발 자전거가 달립니다.");
        super.ride();
    }

    void addWheel() {
        if (wheel == 2) {
            wheel = 4;
            System.out.println(riderName + "의 자전거에 보조바퀴를 부착였습니다.");
        } else {
            System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
        }
    }
}
