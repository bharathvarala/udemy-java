package AdvanceJava;
class A 
{
    public A(){
        System.out.println("In A constructor");
    }
    int a = 10;
    public void show(){
        System.out.println("in A show");
    }
    class B{
        public B(){
            System.out.println("In B constructor");
        }
        int b = 5 ;
        public void show1(){
            System.out.println(a);
            System.out.println("in B show");
        }
    }
    static class C{
        public C(){
            System.out.println("In C constructor");
        }
        public void show2(){
            System.out.println("in C show");
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // non static inner class
        A.B obj1 = obj.new B();
        obj1.show1();

        // static inner class
        A.C obj2 = new A.C();
        obj2.show2();
    }
}
