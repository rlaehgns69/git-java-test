package section16._map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex16_14 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("spring", "봄");
        map.put("summer", "여름");
        map.put("fall", "가을");
        map.put("winter", "겨울");

        // 순서 없음 , 키의 중복 없음.

        System.out.println(map);

        map.remove("fall");

        System.out.println(map);

        Set<String> set = map.keySet();
        System.out.println(set);

        Set<Map.Entry<String, String>> set2 = map.entrySet();
        System.out.println(set2);
        for (Map.Entry<String, String> entry : set2) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
