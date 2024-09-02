// method overloading -> same method name but different no. of inputs.

class A{
    int a =10;
    int b = 20;
    A(){
        this.a = a;
        this.b = b;
        System.out.println(this.a+this.b);
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a){
        return a;
    }
    public double add(double a,int b){
        return a+b;
    }
}




public class Demo1 {
    public static void main(String[] args) {
        A obj = new A();
        int r1 = obj.add(5);
        int r2 = obj.add(5,10);
        int r3 = obj.add(5,10,15);
        double r4 = obj.add(12.23,12);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);

    }
    
    
}
