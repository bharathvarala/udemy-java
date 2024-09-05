package AdvanceJava;

@FunctionalInterface
interface A1 {
    void show(int i);
}
// Lambda Expression -> only for functional interfaces.

@FunctionalInterface
interface A2
{
    int add(int a,int b);
}
public class LambdaExpressions {
    public static void main(String[] args) {
        
        A1 obj = (int i) -> System.out.println(i);
        obj.show(5);

        // A2 obj1 = (i,j) -> i+j;
        A2 obj1 = (int i,int j) -> {
            return i+j;
        };
        System.out.println(obj1.add(12,15));


    }
}
