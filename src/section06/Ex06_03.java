package section06;

public class Ex06_03 {
    public static void main(String[] args) {
        int[] intArr = new int[5];

        System.out.println("intArr[0] = " + intArr[0]); // 초기값: 0

        String[] strArr = new String[5];
        System.out.println("strArr[0] = " + strArr[0]);

        double[] doubleArr = new double[5];
        System.out.println("doubleArr[0] = " + doubleArr[0]);

        char[] charArr = new char[5];
        System.out.println("charArr[0] = " + charArr[0]); // 초기값 : ''\

        int[] varArr = {1, 2, 3, 4, 5};
        System.out.println("varArr[0] = "+varArr[0]);
    }
}
