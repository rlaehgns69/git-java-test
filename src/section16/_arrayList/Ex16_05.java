package section16._arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex16_05 {
    public static void main(String[] args) {
       
        List<String> list = new ArrayList<>();

        list.add("딸기");
        list.add("바나나");
        list.add("망고");
    
        System.out.println(list);

        list.set(1,"수박");
        System.out.println(list);
    }
}
