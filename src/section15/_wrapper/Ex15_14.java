package section15._wrapper;

public class Ex15_14 {
    public static void main(String[] args) {
        Integer num01 = new Integer(10);
        System.out.println(num01);

        Integer num02 = Integer.valueOf(10);
        System.out.println(num02);

        Double doubleNum01 = Double.valueOf(3.123);
        System.out.println(doubleNum01);

        Character ch = Character.valueOf('A');
        System.out.println(ch);

        Integer num03 = 10; // 기본 타입 -> Wrapper 타입으로 "오토박싱"
        System.out.println(num03);

        // autoboxing autounboxing
        int num04 = num02; // Wrapper 타입 -> 기본 타입으로 "오토언박싱"
        System.out.println(num04);
    }
}
