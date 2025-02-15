package section12.multi_exrtends;

public class Ex12_23 {
    public static void main(String[] args) {

        BluetoothMic bluetoothMic = new TjMic();
        // TjMic bluetoothMic = new TjMic();
        // Microphone bluetoothMic = new TjMic();
        // Speaker blutetoothMic = new TjMic;

        // bluetoothMic.music();
        // bluetoothMic.sing();

        // Microphone microphone = bluetoothMic;
        // microphone.sing();
        // // miscrophone.music(); // 인터페이스로 형변환이 가능하나 타입이 바뀐거니까 해당 메서드만 호출 가능. // 호출
        // ㅂ불가

        // Speaker speaker = bluetoothMic;
        // speaker.music();
        // // speaker.sing(); // 호출 불가

        bluetoothMic.connect();
        bluetoothMic.music();
        bluetoothMic.sing();

    }
}
