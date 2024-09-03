package AdvanceJava;

class A 
{
    public void show(){
        System.out.println("In A show");
    }
}
public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        A obj = new A()
        // Anonymous inner class -> doesnt have a name and overrides methods of class.
        {
            public void show(){
                System.out.println("In anonymous show");;
            }
        };
        obj.show();

    }
}
