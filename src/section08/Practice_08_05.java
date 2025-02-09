package section08;

class PersonClass {
    private int age;

    int getAge() {
        return age;
    }

    void setAge(int num) {
        if (num <= 0) {
            System.out.println("잘못된 수를 입력하셨습니다. 1이상의 값으로 설정하세요.");
        } else {
            age = num;
        }

    }
}

public class Practice_08_05 {
    public static void main(String[] args) {
        PersonClass lee = new PersonClass();
        lee.setAge(-10);
        lee.setAge(30);
        System.out.println("lee의 나이는 " + lee.getAge() + "세 입니다.");
    }
}
