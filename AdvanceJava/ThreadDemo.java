package AdvanceJava;
class AT1 extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
        }
    }
}
class AT2 extends Thread 
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        AT1 a = new AT1();
        AT2 b = new AT2();
        // thread -> for dividing a single process into multiple threads (parallel processing)
        
        // class must contain run() method to use start 
        a.start();
        b.start();
    }
}
