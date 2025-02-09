package section11.computer;

public class ComputerRoom {
    Computer computer1;
    Computer computer2;
    Computer computer3;

    void allPowerOn() {
        computer1.powerOn();
        computer2.powerOn();
        computer3.powerOn();
    }

    void allPowerOff() {
        computer1.powerOff();
        computer2.powerOff();
        computer3.powerOff();
    }
}