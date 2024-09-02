class A 
{
    public A(){
        System.out.println("In A's constructor");
    }
}
public class anonymous {
    public static void main(String[] args) {
        
        // object with no reference variable is known as anonymous object
        // It can be used only once 
        new A();
    }
    
}
