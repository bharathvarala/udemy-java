package AdvanceJava;


abstract class A 
{
    public abstract void show();
}

// class B extends A {

//     @Override
//     public void show() {
//         System.out.println("Implemented...");
//         // throw new UnsupportedOperationException("Unimplemented method 'show'");
//     }
    
// }

public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
       // Instead of creating a new class just to implement an abstract method, we can make use of anonymous inner class 
    A obj = new A(){
        public void show(){
            System.out.println("In anonymous inner class implementation");
        }
    };
    obj.show(); 
    }
    
}
