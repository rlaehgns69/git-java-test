package section12._interface;

interface I {
    void printClassname();
}

class A implements I {
    @Override
    public void printClassname() {
        System.out.println("A class");
    }
}

class B implements I {
    @Override
    public void printClassname() {
        System.out.println("B class");
    }
}

class C implements I {
    @Override
    public void printClassname() {
        System.out.println("C class");
    }
}

public class Main {
    public static void main(String[] args) {
        // A a = new A();
        I a = new A();
        a.printClassname();

        //B b = new B();
        I b = new B();
        b.printClassname();

        //C c = new C();
        I c = new C();
        c.printClassname();

    }
}
