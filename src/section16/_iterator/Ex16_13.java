package section16._iterator;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex16_13 {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("apple");
        set.add("apple");
        set.add("banana");
        set.add("mango");

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
