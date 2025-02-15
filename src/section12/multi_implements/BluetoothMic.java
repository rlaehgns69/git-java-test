package section12.multi_implements;

// 인터페이스는 다중 구현이 가능!
public class BluetoothMic implements Microphone, Speaker {
    @Override
    public void sing() {
        System.out.println("마이크로 노래를 부릅니다.");
    }

    @Override
    public void music() {
        System.out.println("마이크에 장착된 스피커에서 반주가 나옵니다.");
    }
}
