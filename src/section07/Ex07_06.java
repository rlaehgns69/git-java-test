package section07;

public class Ex07_06 {
    public static void main(String[] args) {

        Car car = new Car();
        // int wheel; 지역변수

        System.out.println(car.wheel);// 필드는 초기화 안해도 사용가능
        car.wheel = 4;
        System.out.println(car.wheel);
        //car.ride();

    }
}
