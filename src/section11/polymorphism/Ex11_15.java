package section11.polymorphism;

class Animal {
}

class Pig extends Animal {
}

public class Ex11_15 {
    public static void main(String[] args) {
        Pig pig1 = new Pig();
        Pig pig2 = new Pig();
        Animal animal = pig1;

        // 어떤 객체의 타입이 객체의 타입이거나 상속 관계의 타입이라면 true,
        // 그렇지 않다면 false
        System.out.println(animal instanceof Pig);// true
        System.out.println(animal instanceof Animal);// true

        System.out.println(pig2 instanceof Pig);// true
        System.out.println(pig2 instanceof Animal);// true

        System.out.println();
    }
}
