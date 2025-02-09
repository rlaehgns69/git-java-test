package section07;

public class Practice_07_04 {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        speaker.turnOn();
    }
}

class Speaker {
    // static int volume = 50; //정적 변수
    int volume = 50;// 인스턴스 변수

    void turnOn() { // turnOn 스피커 객체가 만들어지고 실행될때 static 프로그램실행 올라갈때 메모리에 바로 올라감.
        // int volume = 50; // 지역 변수
        System.out.println("스피커의 전원이 켜졌습니다. 기본볼륨은" + volume + "입니다.");
    }
}
