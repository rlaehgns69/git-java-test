package section12;

abstract class Bike {
    int wheel;

    Bike(int wheel) {
        this.wheel = wheel;
    }

    void info() {
        // System.out.println("이 자전거는 " + wheel + "발 자전거입니다.");
        System.out.printf("이 자전거는 %d발 자전거입니다.", wheel);
        System.out.println();
    }

    abstract int getWheel();
}

class ChildBike extends Bike {
    ChildBike(int wheel) {
        super(wheel);
    }

    @Override
    int getWheel() {
        System.out.println(wheel);
        return wheel;
    }
}

public class PRACTICE_12_02 { // 하나의 소스 코드 파일에 여러 클래스가 존재한다면 접근 제한자 public은 하나의 클래스 1개만 존재 해야!
    public static void main(String[] args) {
        // Bike b = new Bike(2); 추상 클래스는 객체 생성 불가
        Bike b = new ChildBike(2);

        ChildBike cb = new ChildBike(4);
        cb.info();
        cb.getWheel();
    }
}

/*
 * 응용문제 5번 정답
 * - 정보 은닉: 실제 구현 클래스의 내용을 전혀 보지 않고도 개발 코드로 객체를 사용할 수 있음.
 * - 모듈화: 구현 클래스들이 독립적으로 구현되고 사용될 수 있음. 재사용성 높아짐.
 */