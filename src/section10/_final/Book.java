package section10._final;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // 오버라이드 불가
    // final void infoTitle() {
    // System.out.println("책의 제목은 " + title + "입니다.");
    // }
    void infoTitle() {
        System.out.println("책의 제목은 " + title + "입니다.");
    }
}
