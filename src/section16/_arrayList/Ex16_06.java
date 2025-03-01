package section16._arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex16_06 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("딸기");
        list.add("바나나");
        list.add("망고");

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(1));
        // ArayList는 삽입, 삭제 시 요소들ㅇ의 인덱스가 변경되기 때문에 시간 복잡도가 높아진다.
        // 반면 조회, 추가는 유리
    }
}
