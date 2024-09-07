package MyLearings;

// We can't define a method without a class
class A{
public int f(int a,int b){
    return a+b;
}
}
public class Functions {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(new A().f(4,5));
    }
}
