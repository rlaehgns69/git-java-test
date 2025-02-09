package section11.computer;

public class Ex11_12 {
    public static void main(String[] args) {
        ComputerRoom computerRoom = new ComputerRoom();
        computerRoom.computer1 = new Samsong();
        computerRoom.computer2 = new Lz();
        computerRoom.computer3 = new Apple();

        computerRoom.allPowerOn();
        computerRoom.allPowerOff();
    }
}
