package section16.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice16_05 {
    public static void main(String[] args) {
        String[] balls = {
                "빨간색",
                "빨간색",
                "빨간색",
                "빨간색",
                "파란색",
                "파란색",
                "파란색",
                "검은색",
                "검은색",
                "검은색"
        };
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);
        // map.put("파란색", 1);
        // System.out.println(map.containsKey("파란색"));

        for (String ball : balls) {
            if (map.containsKey(ball)) {
                map.put(ball, map.get(ball) + 1);
            } else {
                map.put(ball, 1);
            }
        }
        System.out.println(map);

        String[] order = { "빨간색", "파란색", "검은색" };

        for (String key : order) {
            System.out.println(key + " : " + map.get(key) + "개");
        }
    }
}
