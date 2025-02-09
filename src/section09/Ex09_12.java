package section09;

public class Ex09_12 {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.title);
        System.out.println(book1.series);
        System.out.println(book1.page);

        System.out.println();

        Book book2 = new Book("멘토시리즈 자바");
        System.out.println(book2.title);
        System.out.println(book2.series);
        System.out.println(book2.page);

        System.out.println();

        Book book3 = new Book("신데렐라", 200);
        System.out.println(book3.title);
        System.out.println(book3.series);
        System.out.println(book3.page);

        System.out.println();

        Book book4 = new Book(5, "노인과 바다");
        System.out.println(book4.title);
        System.out.println(book4.series);
        System.out.println(book4.page);
    }
}
