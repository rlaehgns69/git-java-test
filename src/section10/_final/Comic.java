package section10._final;

public class Comic extends Book {
    boolean isColor;

    Comic(String title, String author, boolean isColor) {
        super(title, author);
        this.isColor = isColor;
    }

    void infoColor() {
        if (isColor) {
            System.out.println("이 만화책은 컬러입니다.");
        } else {
            System.out.println("이 만화책은 흑백입니다.");
        }
    }

    // @Override
    // void infoTitle() {
    //     System.out.println("이 만화책의 제목은 " + title + "입니다.");
    // }
    @Override
    void infoTitle() {
        System.out.println("이 만화책의 제목은 " + title + "입니다.");
    }
}
