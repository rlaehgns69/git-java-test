package section11.polymorphism;

class Parent {
}

class Child extends Parent {
}

public class Ex11_01 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Child child1 = new Child();

        // Parent parent2 = (Parent) child1;
        Parent parent2 = child1;

        // Child child2 = (Child) parent1; // 강제 형변환 안 됨.
        Child child2 = (Child) parent2;

        Parent parent3 = new Child();// 자동형 변환
        Child chlid3 = (Child) parent3;// 강제형 변환

        // 자식 클래스의 생성자를 호출하여 부모 타입의 객체를 생성한 경우 다시 자식타입으로 강제형 변환 가능
    }
}
