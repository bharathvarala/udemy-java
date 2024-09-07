package AdvanceJava;
class R1 implements Runnable{

    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Hi");
        }
    }
}
class R2 implements Runnable{

    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println("Hello");
        }
    }

}

public class RunnableDemo {
    public static void main(String[] args) {
        R1 obj1 = new R1();
        R2 obj2 = new R2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
