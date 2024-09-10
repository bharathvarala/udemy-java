package StreamAPI;
import java.util.*;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {
        List<Integer> arr =  Arrays.asList(4,5,6,7,12,15);
        // int n=arr.size();

        // ways to print elements of list 
        // for(int i=0;i<n;i++) System.out.println(arr.get(i));
        // for(int i:arr) System.out.println(i);
        // arr.forEach(i -> System.out.println(i*2));

        // filter (returns a stream by filtering out values based on given condition)
        Stream<Integer> s1 = arr.stream();
        Stream<Integer> s2 = s1.filter(i->i%2==1);
        Stream<Integer> s3 = s2.map(i->i*2);
        int s4 = s3.reduce(0,(i,j)->i+j);
        System.out.println(s4);
        // s2.forEach(i->System.out.println(i));
        int ans = arr.stream().filter(n->n%2==1).map(n -> n*2).reduce(0,(i,j)->i+j);
        System.out.println(ans);






    }
}
