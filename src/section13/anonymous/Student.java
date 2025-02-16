package section13.anonymous;

abstract class Person {
    abstract void mySelf();
}

public class Student extends Person {
    @Override
    void mySelf() {
        System.out.println("나는 학생입니다.");
    }

}
