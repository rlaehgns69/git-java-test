package section12._interface;

public interface Phone {
    // 상수
    // public static final int MAX_BATTERY_CAPACITY = 100;// 자바에서 상수는 대문자
    int MAX_BATTERY_CAPACITY = 100;// 자바에서 상수는 대문자 스네이크 케이스
    // 스네이크 케이스 사용
    // 추상 메서드

    // abstract public void openingLogo();

    // abstract public void powerOn();

    // abstract public void powerOff();

    // abstract public void charge();

    void powerOn();

    void powerOff();

    boolean isOn();

    void watchUtube();

    void charge();

}
