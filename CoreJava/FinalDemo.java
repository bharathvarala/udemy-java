

final class NotExtendable {
    // It cant be extended 
}
class A {
    // Final method cant be overridden 
    final public void show(){
        System.out.println("In A");
    }
}
class B extends A {
//     public void show(){
//         System.out.println("In B");
//     }
}

public class FinalDemo {
    public static void main(String[] args) {
        
        // value of this variable cant be changed
        final int num = 10;
        // num = 9;
        System.out.println(num);

        // even this throws an error
        final A obj = new A();
        obj.show();
        // obj = new B();
    }
}
