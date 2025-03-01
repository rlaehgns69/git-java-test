package section16._arrayList;

import java.util.LinkedList;
import java.util.List;

public class Ex16_07 {
    public static void main(String[] args) {
        // ArrayList<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        list.add("딸기");
        list.add("바나나");
        list.add("망고");

        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.add(0, "수박");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(1));
        // ArayList는 삽입, 삭제 시 요소들ㅇ의 인덱스가 변경되기 때문에 시간 복잡도가 높아진다.
        // 반면 조회, 추가는 유리

        /*
         * 구분: ArrayList, LinkedList
         * 조회: 빠름, 느림
         * 추가: 빠름, 느림
         * 삽입: 느림, 빠름
         * 삭제: 느림, 빠름
         * 수정: 빠름, 느림
         */
    }
}
