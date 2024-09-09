package AdvanceJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int age;
    String name;
    public Student(int age,String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    

}



public class ComparatorAndComparable {
    public static void main(String[] args) {

        Comparator<Student> comp = new Comparator<Student>()
        {
            public int compare(Student a,Student b){
                if(a.age>b.age) return 1;
                return -1;
        };
        };
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(21,"Bharath"));
        arr.add(new Student(23,"Bala"));
        arr.add(new Student(20,"Aakash"));
        arr.add(new Student(19,"Edho oka ammai le"));
        Collections.sort(arr,comp);
        System.out.println(arr);

        
    }
    
}
