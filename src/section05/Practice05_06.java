package section05;

public class Practice05_06 {
    public static void main(String[] args) {
        /*
         * 
         * ######*_ #:6 *_:1
         * ####*_*_*_ #:4 *_:3
         * ##*_*_*_*_*_ #:2 *_:5
         * _*_*_*_*_*_*_ #:0 *_:7
         * 
         * 
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 3 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i) + 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6 - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
