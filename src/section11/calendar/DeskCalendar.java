package section11.calendar;

public class DeskCalendar extends Calendar {
    DeskCalendar(String color, int months) {
        super(color, months);
    }

    @Override
    void hanging() {
        System.out.println(color + "달력을 벽에 걸기 위해서는 고리가 추가되어야 합니다.");
    }

    void onTheDesk() {
        System.out.println(color + "달력을 책상위에 세울 수 있습니다.");
    }
}
