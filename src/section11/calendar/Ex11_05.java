package section11.calendar;

public class Ex11_05 {
    public static void main(String[] args) {
        DeskCalendar deskCalendar = new DeskCalendar("보라색", 6);
        deskCalendar.info();
        deskCalendar.hanging();
        deskCalendar.onTheDesk();

        System.out.println();

        Calendar calendar = new Calendar("검은색", 10);
        calendar.info();
        calendar.hanging();
        // calendar.onTheDesk();

        Calendar calendar2 = new DeskCalendar("검은색", 10);
        calendar2.info();
        calendar2.hanging();
        // calendar2.onTheDesk();
    }
}
