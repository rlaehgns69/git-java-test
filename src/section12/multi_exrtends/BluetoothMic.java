package section12.multi_exrtends;

public interface BluetoothMic extends Microphone, Speaker {
    void connect();
}
