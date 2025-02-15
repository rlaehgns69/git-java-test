package section11.practice;

class Car {
}

class Bus extends Car {
}

class SchoolBus extends Bus {
}

class OpenCar extends Car {
}

class SportsCar extends OpenCar {
}

public class Practice_11_01 {
    public static void main(String[] args) {
        Car c1 = new SchoolBus();
        Bus b1 = new Bus();
        // SchoolBus sb = new Car();
        SchoolBus schoolBus = new SchoolBus();
        Bus bus1 = schoolBus;

        Bus bus2 = new SchoolBus();
        SchoolBus sb = (SchoolBus)bus2;

        Car c2 = new OpenCar();
        OpenCar oc = new SportsCar();
        // Bus b3 = new OpenCar();
        Car b3 = new OpenCar();
        // Bus b4 new SportsCar();
        Car b4 = new SportsCar();
    }
}
