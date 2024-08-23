class Student{
    int rollno;
    String name;
    double marks;
}
public class arrayOfObjects {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.rollno=1;
        s1.name="A";
        s1.marks=90.4;

        Student s2 = new Student();
        s2.rollno=2;
        s2.name="B";
        s2.marks=85.9;

        Student s3 = new Student();
        s3.rollno=3;
        s3.name="C";
        s3.marks=76.4;

        // Array of objects
        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student s:students){
            System.out.println(s.marks);
        }





    }
}
