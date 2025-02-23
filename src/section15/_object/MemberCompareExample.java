package section15._object;

public class MemberCompareExample {
    public static void main(String[] args) {
        Member m1 = new Member();
        Member m2 = new Member();
        m1.setMemberId(100);
        m1.setMemberName("김일남");

        m2.setMemberId(100);
        m2.setMemberName("김이남");

        // hashCode() 메서드 오버라이딩
        // before
        // m1 : 925858445
        // m2 : 1927950199

        // hashCode() 메서드 오버라이딩
        // after
        // m1 : 100
        // m2 : 200

        System.out.println("m1 : " + m1.hashCode());
        System.out.println("m2 : " + m2.hashCode());
        
        // equals() 메서드 오버라이딩 after
        System.out.println("m1.equals(m2): " + m1.equals(m2));

    }
}
