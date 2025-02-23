package section15._string;

public class Ex15_09 {
    public static void main(String[] args) {
        String str = "HelloWorld_MyWorld";

        System.out.println(str.indexOf("World")); // 5
        System.out.println(str.indexOf("Word")); // -1 찾는 문자열이 없는 경우
        System.out.println(str.indexOf("World", 6)); // 13, 시작 인덱스 지정 가능
    }
}
