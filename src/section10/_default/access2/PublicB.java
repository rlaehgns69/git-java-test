package section10._default.access2;

// DefaultC 클래스는 access1이라는 다른 패키지에 존재하고 default 접근제한자이기 때문에 접근 불가
// import section10._default.access1.DefaultC;

public class PublicB {
    public static void main(String[] args) {
        // DefaultC defaultC = new DefaultC();
    }
}
