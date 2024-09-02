class A {
    public void show()
    {
        System.out.println("In A");
    }
}
class B extends A {
    public void show()
    {
        System.out.println("In B");
    }
}
class C extends A {
    public void show()
    {
        System.out.println("In C");
    }
}



public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
    
    
    
}
