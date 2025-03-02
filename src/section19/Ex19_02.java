package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_02 {
    public static void main(String[] args) {
        int read = 0;

        InputStream in = null;

        byte[] buffer = new byte[5]; // 추가

        try {
            in = new FileInputStream("src\\section19\\my_file.txt");
            while (true) {
                read = in.read(buffer); // 수정
                if (read == -1)
                    break;

                System.out.println();
                System.out.println("read : " + read);
                // System.out.print(new String(buffer, 0, read)); // 수정
                // System.out.print(new String(buffer, 0, 5)); // 수정

            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace(); // 예외 발생 당시의 호출 스택에 있던 메서드 정보와 예외 결과 출력!
            }
        }
    }
}
