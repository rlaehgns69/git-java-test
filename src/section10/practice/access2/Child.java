package section10.practice.access2;

import section10.practice.access1.Parent;

public class Child extends Parent {
    void accessParentMethod() {
        // Parent parent = new Parent();
        // parent.parentMethod();
        super.parentMethod(); //264쪽
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.accessParentMethod();
    }
}
