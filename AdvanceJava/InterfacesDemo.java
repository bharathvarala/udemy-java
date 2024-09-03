package AdvanceJava;

// It is not a class 
// All methods in an interface are public and abstract 
// All variables in an interface are final and static 
// Objects cant be created 
// implements keyword is used 

// class - class -> extends
// interface - interface -> extends
// class - interface -> implements

interface X{
    void show();
}
class B implements X{
    public void show(){
        System.out.println("in B show");
    }
}
    
public class InterfacesDemo {
  public static void main(String[] args) {
    X obj = new X(){
        public void show(){
            System.out.println("In anonymous show..");
        }
    };
    obj.show();
  }
}
