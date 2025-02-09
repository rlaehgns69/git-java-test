package section08;

public class Ex08_21 {
    public static void main(String[] args) {
        PersonGetterSetter person = new PersonGetterSetter();
        person.setAge(-99);
        int age = person.getAge();
        System.out.println("나이는 " + age + "세 입니다.");
    }
}
