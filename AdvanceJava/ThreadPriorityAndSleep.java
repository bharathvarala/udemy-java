package AdvanceJava;
class AT3 extends Thread
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class AT4 extends Thread 
{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        AT3 a = new AT3();
        AT4 b = new AT4();
        // thread -> for dividing a single process into multiple threads (parallel processing)
        
        // class must contain run() method to use start().
        // System.out.println(a.getPriority());
        // a.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(a.getPriority());
        a.start();
        b.start();
    }
}
