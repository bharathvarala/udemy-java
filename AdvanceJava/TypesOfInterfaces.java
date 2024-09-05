package AdvanceJava;

// Types -> normal, functional(SAM), Marker

// Normal interface
interface Normal{
    void show();
    void config();
    // static int add(int a,int b){
    //     return a+b;
    // }
}

// Functional (Single Abstract Method) interface
@FunctionalInterface
interface F {
    void func();
    // void x();
}
class Exp1 implements F 
{
    public void func(){
        System.out.println("In func");
    }
}
// Marker Interface
interface Serializable{

}

public class TypesOfInterfaces {
    public static void main(String[] args) {
        // System.out.println(Normal.add(10, 20));
        F obj = new Exp1();
        obj.func();


    }
}
