package section17.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigdecimalExample {
    public static void main(String[] args) {
        System.out.println(new BigDecimal("1.1234567890").setScale(2,
                RoundingMode.FLOOR)); // 1.12
        System.out.println(new BigDecimal("1.1234567890").setScale(2,
                RoundingMode.CEILING)); // 1.13
        System.out.println(new BigDecimal("1.1234567890").stripTrailingZeros());

        System.out.println(new BigDecimal("1.1234").setScale(10));

        System.out.println(new BigDecimal("1.4567").setScale(1, RoundingMode.HALF_UP));
    }
}