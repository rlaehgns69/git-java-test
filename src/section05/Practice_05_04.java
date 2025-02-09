package section05;

public class Practice_05_04 {
    

    public static void main(String[] args) {
        int count = 0;
        while (true) {
            count++;

            int diceNumber1 = (int) (Math.random() * 6) + 1;
            int diceNumber2 = (int) (Math.random() * 6) + 1;
            // System.out.println();
            if (diceNumber1 == diceNumber2) {
                System.out.printf("count:%d diceNumber:%d",count, diceNumber1);
                break;
            }
        }
    }
}
