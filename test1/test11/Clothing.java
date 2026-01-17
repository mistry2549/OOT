package test1.test11;

public class Clothing extends product implements Shippable {
    private boolean isOnsale;
    public Clothing(String name, double basePrice, boolean isOnsale){
        super(name, basePrice);
        this.isOnsale = isOnsale;
    }

    @Override
    public double getFinalprice(){
        if(isOnsale){
            return basePrice * 0.80;
        }
        return basePrice;
    }

    @Override
    public double getShippingCost(){
        return 20.0;
    }

    
}
