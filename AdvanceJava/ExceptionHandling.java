package AdvanceJava;

public class ExceptionHandling {
    public static void main(String[] args) {
    int a = 5;
    int b = 0;
    int nums[] = new int[5];
    try{
        // a = a/b;
        System.out.println(nums[5]);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Cant divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Index is out of bounds");
    }
    finally{
    System.out.println("hello");    
    };
}

}
