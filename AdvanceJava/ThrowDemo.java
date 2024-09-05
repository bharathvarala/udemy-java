package AdvanceJava;

public class ThrowDemo {
    public static void main(String[] args) {
        int b = 2;
        int a = 1;
        try
        {
            a/=b;
            if(a==0){
                // We are throwing the error ourselves.
                // We cant throw 2 errors at the same.
                throw new Exception();
                // throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("a is zero or u divided a by zero");
        }
        catch(Exception e){
            System.out.println("Only Exception thrown");
        }
        finally
        {
            System.out.println("Done");
        }
    }
}
