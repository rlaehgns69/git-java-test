package section10._protected.access2;

import section10._protected.access1.Parent;

public class NotChild {
    void accessTest() {

        // super.accessProtected();// access1 패키지의 Parent 클래스와 상속 관계가 아니기 때문에 접근 불가.
    }
}