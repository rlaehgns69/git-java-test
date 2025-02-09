package section11.bike;

public class Ex11_08 {
    public static void main(String[] args) {
        Bike bike = new FourWheelBike("김일남");
        bike.info();
        bike.ride();
        //bike.addWheel();

        System.out.println();

        FourWheelBike fourWheelBike = (FourWheelBike) bike;
        fourWheelBike.addWheel();
        fourWheelBike.info();
        fourWheelBike.ride();
    }
}
