package section08;

public class Ex08_15 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        CalcReturn calcReturn = new CalcReturn();
        System.out.println("숫자의 합이 " + calcReturn.sum(nums) + "입니다.");
    }
}
