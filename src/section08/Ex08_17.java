package section08;

public class Ex08_17 {
    public static void main(String[] args) {
        int[] kim1 = { 97, 53 };
        int[] kim2 = { 95, 71 };

        MidTerm midTerm = new MidTerm();
        int sum1 = midTerm.score(kim1);
        int sum2 = midTerm.score(kim2);

        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);

        if (sum1 > sum2) {
            System.out.println("kim1 학생의 중간고사 총점이 더 높습니다.");
        } else if (sum1 < sum2) {
            System.out.println("kim2 학생의 중간고사 총점이 더 높습니다.");
        } else {
            System.out.println("두 학생의 중간고사 총점이 같습니다.");
        }
    }
}
