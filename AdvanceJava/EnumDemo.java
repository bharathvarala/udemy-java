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
enum Laptop1
{
    Macbook(200000), Lenovo(50000), Dell(45000);

    private int price;

    private Laptop1(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
}
public class EnumDemo {
    public static void main(String[] args) {
        // int n = 10;
        // System.out.println(n);
        // Status[] s = Status.values();
        // for(Status x:s){
        //     System.out.println(x);

        Laptop1 lap = Laptop1.Lenovo;
        System.out.println(lap.getPrice());

        }
        
        
    }

