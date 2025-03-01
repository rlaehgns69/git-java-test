package section16._arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex16_04 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("딸기");
        list.add("바나나");
        list.add("망고");
    
        System.out.println(list);

        list.add(1,"추가");
        System.out.println(list);
    }
}
