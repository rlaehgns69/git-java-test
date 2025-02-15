package section11.polymorphism;

// 다형성 구현 방법: 상속 + 형변환 + 오버라이딩
class Animal {
    void cry() {

    }
}

class Pig extends Animal {
    @Override
    void cry() {
        System.out.println("꿀꿀");
    }
}

class Cow extends Animal {
    @Override
    void cry() {
        System.out.println("음메");
    }
}

class Tiger extends Animal {
    @Override
    void cry() {
        System.out.println("어흥");
    }
}

class Farm {
    void sound(Animal animal) {
        // 조건식을 이용한 방식
        // if (animal instanceof Pig) {
        // System.out.println("꿀꿀");
        // }
        // if (animal instanceof Cow) {
        // System.out.println("음메");
        // }
        // if (animal instanceof Tiger) {
        // System.out.println("어흥");
        // }

        // 다형성 이용하는 방식
        animal.cry();

    }
}

public class Ex11_17 {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal pig = new Pig();
        Animal cow = new Cow();
        Animal tiger = new Tiger();
        // Farm farm = new Farm();
        // Pig pig = new Pig();
        // Cow cow = new Cow();
        // Tiger tiger = new Tiger();

        farm.sound(pig);
        farm.sound(cow);
        farm.sound(tiger);
    }
}
