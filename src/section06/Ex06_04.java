package section06;

public class Ex06_04 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        // numbers[0] = (int) (Math.random() * 30) + 1;
        // numbers[1] = (int) (Math.random() * 30) + 1;
        // numbers[2] = (int) (Math.random() * 30) + 1;
        // numbers[3] = (int) (Math.random() * 30) + 1;
        // numbers[4] = (int) (Math.random() * 30) + 1;
        // numbers[5] = (int) (Math.random() * 30) + 1;
        // numbers[6] = (int) (Math.random() * 30) + 1;
        // numbers[7] = (int) (Math.random() * 30) + 1;
        // numbers[8] = (int) (Math.random() * 30) + 1;
        // numbers[9] = (int) (Math.random() * 30) + 1;

        // System.out.print(numbers[0]+ " ");
        // System.out.print(numbers[1]+ " ");
        // System.out.print(numbers[2]+ " ");
        // System.out.print(numbers[3]+ " ");
        // System.out.print(numbers[4]+ " ");
        // System.out.print(numbers[5]+ " ");
        // System.out.print(numbers[6]+ " ");
        // System.out.print(numbers[7]+ " ");
        // System.out.print(numbers[8]+ " ");
        // System.out.print(numbers[9]+ " ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 30) + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println("짝수의 합 :"+sum);
    }
}
