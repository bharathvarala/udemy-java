package AdvanceJava;

// We cant create objects of an abstract class
// if atleast one method of a class is abstract, then the class must be abstract
// An abstract class may or maynot have abstract methods
// abstract methods must be overridden by the subclass

abstract class Car 
{
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}
class BMW extends Car{
    public void drive(){
        System.out.println("Driving BMW");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Car c = new BMW();
        c.drive();
        c.playMusic();
    }
}
