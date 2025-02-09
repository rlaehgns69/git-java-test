package section09;

public class Book {
    String title = "제목없음";
    int series = 1;
    int page = 100;

    Book() {

    }

    Book(String title) {
        // this는 객체 자기 자신을 가리킴. 필드 메서드
        this.title = title; // 자바는 모호함을 싫어함.
    }

    Book(String t, int p) {
        title = t;
        page = p;
    }

    // Book(int series, String title) {
    // this.series = series;
    // this.title = title;
    // }

    Book(int s, String t) {
        series = s;
        title = t;
    }

    Book(int s, String t, int p) {
        // title = tl;
        // series = s;
        this(s, t); // 생성자 오버로딩 시 위 코드를 this() 메서드로 표현 가능
        page = p;
    }

}
