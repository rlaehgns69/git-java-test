package section15._string;

public class Ex15_10 {
    public static void main(String[] args) {
        String str = "자바 프로그래밍은 어렵지만 자바를 배울수록 재미있습니다.";

        // String newStr = str.replace("자바", "Java");// 문자열에서 해당하는 모든 문자를 교체함.
        String newStr = str.replaceAll("자바", "Java");// 문자열에서 해당하는 모든 문자를 교체함.

        // System.out.println(str);
        // System.out.println(newStr);
        String str2 = "1I2LOVE3YOU";

        // replaceAll() 메서드에서는 정규식(정규 표현식) 사용 가능
        String newStr2 = str2.replaceAll("[0-9]", " ");

        System.out.println(newStr2);
    }
}
