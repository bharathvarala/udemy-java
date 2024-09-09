package CollectionsAPI;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(45);
        s.add(10);
        s.add(12);
        s.add(32);
        // ordered set
        Set<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(2);
        ts.add(1);
        System.out.println(s);
        System.out.println(ts);
    }
}
