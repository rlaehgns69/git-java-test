package section10.overriding;

public class Samsong extends Computer {
    @Override // 어노테이션
    void powerOn() {
        super.powerOn(); // 부모클래스(상위)
        System.out.println("아이 러브 삼송");
    }

}
