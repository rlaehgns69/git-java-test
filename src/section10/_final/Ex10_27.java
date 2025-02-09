package section10._final;

public class Ex10_27 {
    public static void main(String[] args) {
        Comic comic = new Comic("주머니 괴물", "미상", true);

        comic.infoTitle();
        comic.infoColor();

        final int num = 1;
        // num = 2; // num은 상수로서 변경 불가
        System.out.println(num);
    }

}
