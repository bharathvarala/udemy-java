package CollectionsAPI;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] arr = {1,1,2,3,4,5,5,2,3,4,5};
        for(int i:arr){
            if(mp.containsKey(i)) mp.put(i,mp.get(i)+1);
            else mp.put(i,1);
        }
        System.out.println(mp);
    }
}
