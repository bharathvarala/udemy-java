package StreamAPI;

import java.util.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Random rand = new Random();
        for(int i=0;i<10000;i++) nums.add(rand.nextInt(1000));
        // System.out.println(nums);

        int sum1 = nums.stream().map(n->n*2).mapToInt(i->i).sum();
        int sum2 = nums.parallelStream().map(n->n*2).mapToInt(i->i).sum();
        // System.out.println(sum1);

        List<String> names = Arrays.asList("Bharath","A","laxman","noname");
        Optional<String> name = names.stream().filter(str->str.contains("x")).findFirst();
        System.out.println(name);

        
    }
}
