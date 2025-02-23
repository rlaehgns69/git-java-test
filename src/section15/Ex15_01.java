package section15;

public class Ex15_01 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        // 객체의 참초를 비교
        System.out.println("str1==str2 : " + (str1 == str2)); // true
        System.out.println("str1==str3 : " + (str1 == str3)); // false
        System.out.println("str3==str4 : " + (str3 == str4)); // false

        System.out.println("str1 identityHashCode :\t " + System.identityHashCode(str1));// 자바 객체 해시코드 보고싶을때
        System.out.println("str1 HashCode :\t\t " + str1.hashCode());;
        System.out.println("str2 identityhashCode :\t " + System.identityHashCode(str2));// 자바 객체 해시코드 보고싶을때
        System.out.println("str2 HashCode :\t\t " + str2.hashCode());
        System.out.println("str3 identityhashCode :\t " + System.identityHashCode(str3));// 자바 객체 해시코드 보고싶을때
        System.out.println("str3 HashCode :\t\t " + str3.hashCode());
        System.out.println("str4 identityhashCode :\t " + System.identityHashCode(str4));// 자바 객체 해시코드 보고싶을때
        System.out.println("str4 HashCode :\t\t " + str4.hashCode());

    }
}
