package AdvanceJava;

interface Computer{
    void developWork();
}
class Desktop implements Computer
{
    public void developWork(){
        System.out.println("code and run but faster");
    }
}
class Laptop implements Computer
{
    public void developWork(){
        System.out.println("code and run");
    }
}
class Developer 
{
    public void develop(Computer lap){
        lap.developWork();
    }
}
public class NeedForInterfaces {
    public static void main(String[] args) {
        // In this case a developer cant say he can work only on a lappy or a desktop. He should be comfortable to work on any device 
        // To solve this problem we can make use of an interface or abstract class Computer.
        Computer lappy = new Laptop();
        Computer desky = new Desktop();
        Developer bharath = new Developer();
        bharath.develop(lappy);
        bharath.develop(desky);
    }
}
