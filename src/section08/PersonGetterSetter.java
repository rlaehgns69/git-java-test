package section08;

public class PersonGetterSetter {
    private int age;

    // getter 메서드
    int getAge() {
        return age;
    }

    // setter 메서드
    // 유효성 검사
    void setAge(int num) {
        if (num >= 0) {
            age = num;
        } else {
            System.out.println("0보다 작은 나이는 입력할 수 없습니다.");
        }
    }
}
