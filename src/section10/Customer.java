package section10;

public class Customer extends Person {
    int memberId;

    // 부모 클래스의 생성자가 정의되어 있다면 자식 클래스에서 상속 받아야 함.
    Customer(String name, int age, int memberId) {
        super(name, age);
        this.memberId = memberId; // 부모 클래스가 가지고 있지 않은 필드 추가

    }

    void enter() {
        System.out.printf("회원번호: %d(%s,%d세) 님 입장하셨습니다\n", memberId,
                name, age);
    }
}
