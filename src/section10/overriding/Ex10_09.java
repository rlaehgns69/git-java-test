package section10.overriding;

public class Ex10_09 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        computer.powerOff();

        System.out.println();

        Samsong samsong = new Samsong();
        samsong.powerOn();
        samsong.powerOff();
    }
}
