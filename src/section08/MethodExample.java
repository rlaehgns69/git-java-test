package section08;

public class MethodExample {
    static void method1() {
        System.out.println("1. 반환값 없음, 매개변수 없음");
    }

    static void method2(String parameter) {
        System.out.println("2. 반환값 없음, 매개변수 있음" + parameter);
    }

    static String method3() {
        return "3. 반환값 있음, 매개변수 없음";
    }
    
    static String method4(String parameter) {
        return parameter;
    }

    public static void main(String[] args) {
        MethodExample.method1();
        // System.out.println(MethodExample.method1());
        MethodExample.method2("!");
        String result3 = MethodExample.method3();
        System.out.println(result3 + "\n" + result3);
        System.out.println(MethodExample.method4("4. 반환값 있음, 매개변수 있음"));
    }
}
