package AdvanceJava;

class A5{
    public void show() throws Exception{
        int i=0;
        int j = 1;
        j/=i;
        System.out.println("It is getting executed");
    }
}
public class ThrowsDemo {
    public static void main(String[] args) {
        A5 obj = new A5();
        try{
            obj.show();
        }
        catch(Exception e)
        {
            System.out.println("I caught the Exception");
        } 
    }
}
