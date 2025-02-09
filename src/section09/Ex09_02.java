package section09;

public class Ex09_02 {
    public static void main(String[] args) {
        Snack chip = new Snack();
        chip.price = 2000;
        chip.info();

        Snack chip2 = new Snack(5000);
        chip2.info();
    }
}
