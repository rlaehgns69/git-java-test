package section10._public.access1;

// public 접근 제한자는 모든 패키지
public class PublicA {
    public int a;

    public PublicA(int a) {
        this.a = a;
    }

    public void printA() {
        System.out.println("PublicA 클래스의 printA() 메서드입니다.");
    }
}
