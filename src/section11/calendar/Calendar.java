package section11.calendar;

public class Calendar {
    String color;
    int months;

    Calendar(String color, int months) {
        this.color = color;
        this.months = months;
    }

    void info() {
        System.out.printf("%s 달력은 %d월까지 있습니다.\n", color, months);
    }

    void hanging() {
        System.out.println(color + "달력을 벽에 걸 수 있습니다.");
    }
}
