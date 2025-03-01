package section16._generic;

class ClassInt {
    private int element;

    void set(int element) {
        this.element = element;
    }

    int get() {
        return element;
    }
}

class ClassString {
    private String element;

    void set(String element) {
        this.element = element;
    }

    String get() {
        return element;
    }
}

class ClassDouble {
    private Double element;

    void set(Double element) {
        this.element = element;
    }

    Double get() {
        return element;
    }
}

class ClassGeneric<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        ClassInt classInt = new ClassInt();
        classInt.set(10); 
        System.out.println(" classInt : " + classInt.get());

        ClassString classString = new ClassString();
        classString.set("십");
        System.out.println(" classString : " + classString.get());

        ClassDouble classDouble = new ClassDouble();
        classDouble.set(10.1234);
        System.out.println(" classDouble : " + classDouble.get());

        ClassGeneric<Integer> classGenericInteger = new ClassGeneric<>();
        classGenericInteger.set(10);
        System.out.println(" classGenericInteger : " + classGenericInteger.get());

        ClassGeneric<String> classGenericString = new ClassGeneric<>();
        classGenericString.set("십");
        System.out.println(" classGenericString : " + classGenericString.get());

        ClassGeneric<Double> classGenericDouble = new ClassGeneric<>();
        classGenericDouble.set(10.0);
        System.out.println(" classGenericDouble : " + classGenericDouble.get());
    }
}
