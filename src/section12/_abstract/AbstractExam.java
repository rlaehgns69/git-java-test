package section12._abstract;

abstract class Animal {
    abstract void cry(); // 추상 메서드
    // 추상 메서드가 하나라도 존재하는 클래스는 반드시 추상 메서드여야 함.
}

class Pig extends Animal {
    void cry() {
        System.out.println("꿀꿀");
    }
}

// 표준화 !!!
public class AbstractExam {
    public static void main(String[] args) {
        // Animal animal = new Animal(); // 추상 클래스는 객체 생성 불가
        // animal.cry();
        Pig pig = new Pig();
        pig.cry();
    }
}
