class A {
    public void show1()
    {
        System.out.println("In A");
    }
}
class B extends A 
{
    public void show2() {
        System.out.println("In B");
    }
}
public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        double d = 69.69;
        // typecasting
        int n = (int)d;
        System.out.println(d+" "+n);

        // Upcasting -> typecasting an object of subclass to superclass (It is done implicitly) 
        A obj = (A) new B();

        // Downcasting -> typecasting an object referenced to superclass to a subclass
        B obj1 = (B)obj;
        obj.show1();
        obj1.show2();
    }
}
