package inheritance.SingleInheritance;
public class Demo {
    public static void main(String[] args) {
        Calc c = new Calc();
        advCalc adv = new advCalc();
        int r1 = adv.add(10, 20);
        int r2 = adv.sub(10, 20);
        int r3 = adv.mul(10, 20);
        int r4 = adv.div(10, 20);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
    
}
