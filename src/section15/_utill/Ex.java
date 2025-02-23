package section15._utill;

import java.util.Calendar;

public class Ex {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        String bseDt = "20230219";
        cal.set(Calendar.YEAR, Integer.parseInt(bseDt.substring(0, 4)));
        cal.set(Calendar.MONTH, Integer.parseInt(bseDt.substring(4, 6)) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(bseDt.substring(6, 8)));

        if (cal.getActualMaximum(Calendar.DAY_OF_MONTH) == 29) {
            System.out.println("윤년 입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }

    }
}
