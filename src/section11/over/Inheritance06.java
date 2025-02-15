package section11.over;

class Parent {
    void display() {
        System.out.println("부모 클래스의 display() 메서드입니다.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("자식 클래스의 display() 메서드입니다.");
    }

    // 오버로딩
    void display(String str) {
        System.out.println(str);
    }
}

public class Inheritance06 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
        child.display("오버로딩된 display() 메서드입니다.");
    }

}
