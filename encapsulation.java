class Human
{
    private int age = 21;
    private String name = "Bharath";

    // getter methods
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    // setter methods
    public void setAge(int x){
        this.age = x;
    }
    public void setName(String y){
        this.name = y;
    }


}   

public class encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        System.out.println(h1.getAge());
        System.out.println(h1.getName());
        h1.setAge(20);
        System.out.println(h1.getAge());
    }
}
