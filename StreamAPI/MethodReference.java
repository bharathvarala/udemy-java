package StreamAPI;
import java.util.*;


class Stud
{

    private int age;
    private String name;
    
    public Stud() 
    {

    }

    public Stud(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stud [age=" + age + ", name=" + name + "]";
    }
    
    
    
}



public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bharath","Aakash","Bala");
        
        // :: -> for method reference.
        // List<String> uNames = names.stream().map(String::toUpperCase).toList();
        // System.out.println(uNames);

        // Constructor Reference.
        List<Stud> students = new ArrayList<>();
        // for(String name:names) students.add(new Stud(name));
        // students = names.stream().map(name -> new Stud(name)).toList();
        students = names.stream().map(Stud::new).toList();
        System.out.println(students);  
    }
}
