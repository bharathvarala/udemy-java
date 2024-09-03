package AdvanceJava;

enum Status {
    Ready,Running,Queue,Preempted,Dead;
    // public String toString(){
    //     String s="";
    //     for(Status x:Status.values()){
    //         s = x+" ";
    //     }
    //     System.out.println(s);
    //     return s;
    // }
}
public class EnumDemo {
    public static void main(String[] args) {
        // int n = 10;
        // System.out.println(n);
        Status[] s = Status.values();
        for(Status x:s){
            System.out.println(x);
        }
    }
}
