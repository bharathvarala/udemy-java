package CollectionsAPI;
import java.util.ArrayList;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            // Consume the newline given by nextInt
            sc.nextLine();
            String s = sc.nextLine().trim();
            String[] ns = s.split(" ");
            ArrayList<Integer> arr = new ArrayList<>();
            for(String c:ns) arr.add(Integer.parseInt(c));
            for(Integer i:arr) System.out.print(i*2+" ");
            t-=1;
        }
        

    }
}
