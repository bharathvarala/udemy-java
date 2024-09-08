package AdvanceJava;

class TM
{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}

public class ThreadsAndMutation {
    public static void main(String[] args) {
        TM c = new TM();
        Runnable obj1 = () -> 
        {
            for(int i=0;i<1000;i++)
            c.increment();
        };
        Runnable obj2 = () -> 
        {
            for(int i=0;i<1000;i++)
            c.increment();
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        System.out.println(c.count);
}
    
}
