package AdvanceJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

// Comparable
class Student implements Comparable<Student>
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
    public int compareTo(Student that){
        if(this.age>that.age) return 1;
        return -1;
        
    }
    

}

public class ComparatorAndComparable {
    public static void main(String[] args) {
        // Comparator
        // Comparator<Student> c = new Comparator<Student>() {
        //     public int compare(Student a,Student b){
        //         if(a.age>b.age) return 1;
        //         return -1;
        //     }
        // };
        // Both comparators are same.
        
        Comparator<Student> comp = (a, b) -> a.age>b.age?1:-1;

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(new Student(21,"Bharath"));
        arr.add(new Student(23,"Bala"));
        arr.add(new Student(20,"Aakash"));
        arr.add(new Student(19,"Edho oka ammai le"));
        Collections.sort(arr,comp);
        System.out.println(arr);


        
    }
    
}
