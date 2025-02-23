package section15._object;

public class Car {
    private String carName;
    private String company;

    public Car(String carName, String company) {
        this.carName = carName;
        this.company = company;
    }

    @Override
    public String toString() {
        return "차량 이름 : " + this.carName + ", 제조사 : " + this.company;
    }

    public static void main(String[] args) {
        Car car = new Car("소나타", "현대");
        System.out.println(car);// section15._toString.Car@4517d9a3

        // toString() 메서드 오버라이딩 전: section15._toString.Car@4517d9a3
        // toString() 메서드 오버라이딩 후: 차량 이름 : 소나타, 제조사 : 현대
    }
}
