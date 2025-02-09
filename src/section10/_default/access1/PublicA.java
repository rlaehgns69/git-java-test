package section10._default.access1;

public class PublicA {
    DefaultC defaultC = new DefaultC(); // 동일 패키지 내에서 호출 가능

    void methodA() {
        defaultC.varC = 20;
    }

}
