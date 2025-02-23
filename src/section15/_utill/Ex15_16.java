package section15._utill;

import java.util.Calendar;

public class Ex15_16 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2022, 0, 1);

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1); // 0 ~ 11 +1
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        System.out.println(cal.get(Calendar.AM_PM)); // 0 오전, 1 오후

    }
}
