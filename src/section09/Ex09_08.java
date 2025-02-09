package section09;

class Phone {
    String brand;
    int series;
    String color = "검정색";

    void phoneInfo() {
        System.out.printf("%s %s %d\n", color, brand, series);
    }

    Phone(String b, int s, String c) {
        brand = b;
        series = s;
        color = c;
    }

    // 생성자 오버로딩
    Phone(String b, int s) {
        brand = b;
        series = s;
    }

    Phone() {

    }
}

public class Ex09_08 {
    public static void main(String[] args) {
        Phone p1 = new Phone("갤럭시", 1, "흰색");
        p1.phoneInfo();
        Phone p2 = new Phone("아이폰", 2);
        p2.phoneInfo();
        Phone p3 = new Phone();
        p3.brand = "Nokia";
        p3.series = 4;
        p3.color = "파란색";
        p3.phoneInfo();
    }
}
