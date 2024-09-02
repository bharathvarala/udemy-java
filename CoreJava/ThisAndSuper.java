
// this() -> to call the constructor of same class 
// super() -> to call the constructor of super class 
class A 
{
    public A()
    {
        // super method is default in every constructor
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        // super method is default in every constructor
        super();
        System.out.println("In int A");
    }

}


class B extends A
{
    public B()
    {
        // super method is default in every constructor
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        // super method is default in every constructor
        // super();
        // super can be called only once
        // super(n);
        this();
        System.out.println("In int B");
    }

}
class C extends B
{
    public C(){
        System.out.println("In C");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B(9);
        // C c = new C();
    }
    
}
