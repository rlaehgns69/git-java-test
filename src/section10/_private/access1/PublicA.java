package section10._private.access1;

public class PublicA {
    public int a;
    PublicA publicA;

    // private은 동일 클래스 내에서만 접근 가능
    private PublicA(int a) {
        this.a = a;
    }

    public void printA() {
        System.out.println("PublicA클래스의 printA 메서드입니다.");
    }

    public void setPublicA(int a){
        publicA = new PublicA(a);
    }

    public static void main(String[] args) {
        new PublicA(10);
    }
}
