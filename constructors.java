class Human{
    int age;
    String name;
    int dob;
    // Default constructor
    public Human()
    {
        this.age=0;
        this.name = "";
        this.dob=0;
        System.out.println("In default constructor");
    }

    // Parameterized constructors
    // It is also known as constructor overloading
    public Human(int age){
        this.age = age;
        this.name = "";
        this.dob=0;
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
        this.dob=0;
    }
    public Human(int age,String name,int dob){
        this.age=age;
        this.name=name;
        this.dob=dob;
    }

}
public class constructors {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human(21);
        Human h3 = new Human(21,"Bharath");
        Human h4 = new Human(21,"Bharath",12);
        System.out.println(h1.age+" "+h2.name+" "+h3.dob+" "+h4.name);
    }
}
