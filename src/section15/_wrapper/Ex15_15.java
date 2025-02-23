package section15._wrapper;

public class Ex15_15 {
    public static void main(String[] args) {
        Integer num01 = Integer.valueOf(10); // 객체이기 때문에 여러 메서드를 활용할 수 있음.
        // int num02 = num01;
        System.out.println(num01);

        String intStr = "70";
        // Integer intNum = Integer.parseInt(intStr);
        int intNum = Integer.parseInt(intStr);
        System.out.println(intNum + 1);

        String doubleStr = "3.1234";
        double doubleNum = Double.parseDouble(doubleStr);
        System.out.println(doubleNum + 1);
    }
}
