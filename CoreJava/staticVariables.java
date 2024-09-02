class Mobile
{
    String brand;
    int price;
    static String type;
    static int count = 0;
    static 
    {
        type = "Phone";
        System.out.println("In static block");
    }

    public Mobile(String brand,int price)
    {
        this.brand = brand;
        this.price = price;
        count++;
        System.out.println("In Construtor "+count);
    }
    public void display()
    {
        System.out.println(this.brand+" "+this.price+" "+type);
    }

    // In non static methods both instance and static variables can be used.
    // only static variables can be directly used in a static method.
    // To make use of instance variables obj reference must be mentioned.

    // public static void show(Mobile obj)
    // {
    //     System.out.println(Mobile.type+" "+obj.brand+" "+obj.price);
    // } 
}
public class staticVariables {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung",25000);
        Mobile m2 = new Mobile("Apple",100000);
        // System.out.println(Mobile.type);
        // m1.display();
        // m2.display();
        // Mobile.show(m2);
    }
    
}
