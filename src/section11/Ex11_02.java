package section11;

class Car {

}

class Bus extends Car {

}

class SchoolBus extends Bus {
}

class OpenCar extends Car {

}

class SportCar extends OpenCar {

}

public class Ex11_02 {
    Car c1 = new SchoolBus(); // 자동형 변호나
    Bus b1 = new Bus();
    Bus b2 = new SchoolBus(); // 자동형 변환

    Car c2 = new OpenCar(); // 자동형 변환
    OpenCar openCar = new SportCar(); // 자동형 변환

    // Bus b3 = (Bus) c2; // 강제형 변환 불가, OpenCar는 Bus와 무관
}
