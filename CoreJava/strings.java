public class strings {
    public static void main(String[] args) {
        String name = new String("Bharath");
        System.out.println(name);
        
        // if new object is created, then new value is assigned in the String Constant Pool
        String s1 = new String("A");
        String s2 = new String("A");
        // System.out.println(s1==s2);

        // In this case s3 and s4 both point to the same "B" generated
        String s3 = "B";
        String s4 = "B";
        // System.out.println(s3==s4);

        // StringBuffer (Thread Safe)
        StringBuffer sBuff = new StringBuffer("Bharath");
        System.out.println(sBuff.substring(3));

        // StringBuilder(Isnt thread safe)
        StringBuilder sBuild = new StringBuilder("My Name");
        sBuild.append(" is Bharath");
        System.out.println(sBuild);


    }
    
    
}
