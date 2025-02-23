package section15._math;

public class Ex15_13 {
    public static void main(String[] args) {

        System.out.println("올림 : " + Math.ceil(3.14)); // 4.0
        System.out.println("버림 : " + Math.floor(3.64)); // 3.0
        System.out.println("반올림 : " + Math.round(3.64)); // 4

        // 소수점 둘째 자리
        System.out.println("올림 : " + Math.ceil(3.14 * 10) / 10.0); // 3.2
        System.out.println("버림 : " + Math.floor(3.64 * 10) / 10.0); // 3.6
        System.out.println("반올림 : " + Math.round(3.64 * 10) / 10.0); // 3.6
        System.out.println("반올림 : " + Math.round(3.65 * 10) / 10.0); // 3.7
        // 소수점 셋째 자리
        System.out.println("반올림 : " + Math.round(3.657 * 100) / 100.0); // 3.66

        // System.out.println(Math.abs(-123)); // 절대값
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));

        // 난수 구하기
        System.out.println(Math.random());// 반환값 실수: 0.0 ~ 0.999...
        System.out.println((int) (Math.random() * 10) + 1);// 1 ~ 10
    }
}
