package section09;

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void introduce() {
        System.out.println("안녕하세요. 저는 " + age + "세 " + name + "입니다.");
    }
}

public class Ex09_06 {
    public static void main(String[] args) {
        Person p1 = new Person("김일남",99);
        p1.introduce();
        
        Person p2 = new Person("김이남",98);
        p2.introduce();
    }
}