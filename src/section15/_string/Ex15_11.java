package section15._string;

public class Ex15_11 {
    public static void main(String[] args) {
        String str = "1234-5678";

        String subStr = str.substring(5);

        System.out.println(subStr);

        // 시작하는 인덱스 포함, 끝나는 인덱스 포함 안됨.
        String rangeStr = str.substring(0, 4);
        System.out.println(rangeStr);

        String rangeStr2 = str.substring(6, 8);
        System.out.println(rangeStr2);
    }
}
