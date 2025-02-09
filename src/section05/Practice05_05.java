package section05;

public class Practice05_05 {
    public static void main(String[] args) {
        /*
         * 
         * ###*_ #:3, *_:1
         * ##*_*_ #:2, *_:2
         * #*_*_*_ #:1. *_:3
           *_*_*_*_ #:0. *_:4
         * 
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 3 - i; j > 0; j--) {
                System.out.print("#");
            }
            // for(int k = 0; k < 4; k++){
            // System.out.print("*");
            // }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 3 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
