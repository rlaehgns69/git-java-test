package section14;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str01 = "11";
        String str02 = "11.2";

        int num01 = Integer.parseInt(str01);

        System.out.println("String to int :" + (num01 + 9));

        int num02 = Integer.parseInt(str02);

        System.out.println("String to int :" + (num02 + 9));

        double num03 = Double.parseDouble("1.11");
        
        System.out.println("String to double :" + (num03 + 9));
    }
}
