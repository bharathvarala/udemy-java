class A{
    // instance variable (Heap)
    int num=15;

    // method (call in Heap, and has it's own stack of variables)
    public int add(int n,int m){
        return n+m;
    }
}
public class memory {

    // Main method has its own stack of variables.
    public static void main(String[] args) {
        int a = 10;
        A c = new A();
        int r = c.add(2,3);
        A c1 = new A();
        c.num = 16;
        System.out.println(c.num);
        System.out.println(c1.num);
        System.out.println(r);
    }
}

// There are 2 types of memories 
// 1. Stack
// 2. Heap

// Stack -> variables of all methods
// Every method has it's own stack 

// Heap consists of instance variables and method calls