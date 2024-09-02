package inheritance.MultiLevelInheritance;
public class Demo {
    public static void main(String[] args) {
        Calc c = new Calc();
        // advCalc adv = new advCalc();
        SciFiCalc scifi = new SciFiCalc();
        int r1 = scifi.add(10, 20);
        int r2 = scifi.sub(10, 20);
        int r3 = scifi.mul(10, 20);
        int r4 = scifi.div(10, 20);
        // int r5 = c.mul() 
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
    
}
