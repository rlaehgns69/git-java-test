package section09;

class Book {
    String title;
    int pages;
    String author;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    Book(int pages, String author) {
        this.pages = pages;
        this.author = author;
    }

    Book() {

    }
}

public class Practice_09_05 {
    public static void main(String[] args) {
        Book book1 = new Book("어린왕자", 300);
        Book book2 = new Book();
        Book book3 = new Book(300, "생텍쥐베리");
    }
}
