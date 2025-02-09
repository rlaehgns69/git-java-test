package section10._protected.access2;

import section10._protected.access1.Parent;

public class Child extends Parent {
    void accessTest() {
        Parent parent = new Parent();
        // parent.accessProtected(); // 접근 제한 자가 protected인 경우에는 다른 패키지에 접근할 때 생성 방식으로
        // 접근 불가
        super.accessProtected(); // 다른 패키지의 protected인 메서드에 접근할 때 super 이용
    }
}
