package test1.test11;

public abstract class product {
    public String name;
    public double basePrice;

    public product(String name, double basePrice){
        this.name = name;
        this.basePrice = basePrice;
    }

    public abstract double getFinalprice();
}
