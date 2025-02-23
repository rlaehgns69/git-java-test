package section15._string;

public class Ex15_08 {
    public static void main(String[] args) {
        String word = "1I2LOVE3YOU";

        String text = "";

        // System.out.println(word.charAt(1));

        // System.out.println(word.length());// 11, 인덱스는 0~10

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int asciiNum = ch;
            // System.out.println(asciiNum);

            // 코드 포인트
            // 0~9 48 ~ 57
            // A~Z 65 ~ 90
            if (asciiNum >= 65 && asciiNum <= 90) {
                text += ch;
            }
            if (asciiNum >= 48 && asciiNum <= 57) {
                text += " ";
            }
        }
        System.out.println(text);

       

    }
}
