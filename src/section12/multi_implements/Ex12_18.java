package section12.multi_implements;

public class Ex12_18 {
    public static void main(String[] args) {

        BluetoothMic bluetoothMic = new BluetoothMic();

        bluetoothMic.music();
        bluetoothMic.sing();

        Microphone microphone = bluetoothMic;
        microphone.sing();
        // miscrophone.music(); // 인터페이스로 형변환이 가능하나 타입이 바뀐거니까 해당 메서드만 호출 가능. // 호출 ㅂ불가

        Speaker speaker = bluetoothMic;
        speaker.music();
        // speaker.sing(); // 호출 불가
    }
}
