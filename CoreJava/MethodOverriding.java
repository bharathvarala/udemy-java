class A 
{
    
    public void show(){
        System.out.println("In A");
    }
}
class B extends A{
    // This show() of B overrides show() of A
    public void show() 
    {
        System.out.println("In B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
