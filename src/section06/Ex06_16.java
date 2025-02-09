package section06;

public class Ex06_16 {
    public static void main(String[] args) {
        int[][] lotto = {
                { 1, 2, 3, 4, 5, 6 },
                { 2, 3, 4, 5, 6, 7 } };

        String myNum = new String("123456");

        String lottoNumber = "";

        for (int i = 0; i < lotto[0].length; i++) {
            lottoNumber += lotto[0][i];
        }

        System.out.println("myNum\t\t" + myNum + "\t" + myNum.hashCode());
        System.out.println("lottoNumber\t" + lottoNumber + "\t" + lottoNumber.hashCode());
        System.out.println(myNum == lottoNumber); // ==주소비교
        System.out.println(myNum.equals(lottoNumber)); // eqauls()값을 비교
    }
}