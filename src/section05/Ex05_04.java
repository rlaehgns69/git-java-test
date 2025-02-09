package section05;

public class Ex05_04 {
    public static void main(String[] args) {
        //첫 번째 피라미드 (위로 증가하는 별찍기)
        System.out.println("      *");
        System.out.println("     ***");
        System.out.println("    *****");
        System.out.println("   *******");
        System.out.println("  *********");
        System.out.println(" ***********");
        System.out.println("*************");
        System.out.println();

        // 두 번째 피라미드 (아래로 감소하는 별찍기)
        for(int i = 0; i < 7; i++) {
        // 공백 출력 (6 - i 만큼 공백)
        for (int j = 0; j < 6 - i; j++) {
        System.out.print(" "); // 공백은 print로 출력하여 한 줄에 이어지게 함
        }

        // 별 출력 (2 * i + 1 만큼 별)
        for (int k = 0; k <13-2*i   + 1; k++) {
        System.out.print("*"); // 별은 print로 출력하여 한 줄에 이어지게 함
        }

        // 한 줄 끝난 후 줄바꿈
        System.out.println();
        }
        for(int i = 1; i < 7; i++){
        for(int j = 0 ; j < 7 - i; j++){
        System.out.print("_");
        }
        for(int k = 0; k < (2*i)+1; k++){
        System.out.print("*");
        }
        System.out.println();
        }

        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 6; i >=0; i--){
        for(int j = 0; j < i; j++){
        System.out.print(" ");
        }
        for(int k = 0; k < 2*(6-i)+1; k++){
        System.out.print("*");
        }
        System.out.println();
        }
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print(" ");
            }
            // for(int k = 0; k < (i * 2)-1; k++){
            // System.out.print("*");
            // }
            System.out.print("*".repeat(2 * i - 1));
            System.out.println();
        }
    }
}
