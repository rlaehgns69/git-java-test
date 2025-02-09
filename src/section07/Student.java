package section07;

public class Student {
    // ---인스턴스 멤버(시작)---
    String studentName;

    void hello(){
        System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
    }

    // ---인스턴스 멤버(끝)---

    // ---정적 멤버(시작)---
    static String schoolName = "코리아 아카데미"; // 인스턴스 변수, 인스턴스 필드

    // 정적 메서드
    static void gotoSchool() {
        System.out.println("학원에 갑니다.");
    }
    // ---정적 멤버(끝)---
}
