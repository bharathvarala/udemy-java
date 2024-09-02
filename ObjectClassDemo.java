class Laptop 
{
    int price;
    String model;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Laptop [price=" + price + ", model=" + model + "]";
    }
    
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        
        Laptop lappy1 = new Laptop();
        lappy1.price = 10000;
        lappy1.model = "Lenovo";
        
        Laptop lappy2 = new Laptop();
        lappy2.model = "Apple";
        lappy2.price=30000;
        
        System.out.println(lappy1.equals(lappy2));
        System.out.println(lappy1.getClass());
        int arr[] = {1,2,3,4};
        System.out.println(arr.getClass());
    }
}
