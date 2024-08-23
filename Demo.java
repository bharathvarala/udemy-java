// class -> Blueprint for an object
class Calc{

    // constructor
    public Calc(){

    }

    // method 
    public void add(int n,int m){
        System.out.println(n+m);
        // return 0;
    }
}
public class Demo {
    public static void main(String[] args) {
    int n = 5;
    int m = 10;
    
    // Oject -> Physical exsistence of a class 
    // Object Creation
    Calc cal =new Calc();

    // method calling
    cal.add(n,m);

    }
    
}
