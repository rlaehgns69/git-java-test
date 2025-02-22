package section14;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String str01 = "11";
            String str02 = "11.2";

            int num01 = Integer.parseInt(str01);

            System.out.println("String to int :" + (num01 + 9));

            int num02 = Integer.parseInt(str02);

            System.out.println("String to int :" + (num02 + 9));

            double num03 = Double.parseDouble("1.11");

            System.out.println("String to double :" + (num03 + 9));

            int num05 = (int) Float.parseFloat("1.111");
            int num06 = (int) Float.parseFloat("1.1.1.11");

            // int "1~9"
            // double "1~9" & "1.0~9.9"

        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 맞지 않습니다.");
        }
    }
}
