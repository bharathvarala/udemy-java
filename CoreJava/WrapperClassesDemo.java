public class WrapperClassesDemo {
    public static void main(String[] args) {
        int n = 10;

        // autoboxing : directly assigning a primitive value to wrapper object 
        Integer n1 = n;

        // auto-unboxing : extracting primitive value from a wrapper object
        int n2 = n1;
        System.out.println(n+" "+n1+" "+n2);

        String s = "15";
        Integer si = Integer.parseInt(s);
        System.out.println(si+12);
    }
}
