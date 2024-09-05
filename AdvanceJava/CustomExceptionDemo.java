package AdvanceJava;

class MyOwnException extends Exception{
    public MyOwnException(String s){
        System.out.println(s);
    }

}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        int i=0;
        int j = 10;
        try{
            if(i==0) throw new MyOwnException("Yo dont do this again");
            j/=i;
            
        }
        catch(MyOwnException e){
            System.out.println("Dont do it!!");
        }

    }
}
