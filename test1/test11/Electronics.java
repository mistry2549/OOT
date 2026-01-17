package test1.test11;

public class Electronics extends product implements Shippable {
    public Electronics(String name, double basePrice){
        super(name, basePrice);
    }

    @Override
    public double getFinalprice(){
        if(basePrice > 5000){
            return basePrice * 0.90;
        }

        return basePrice;
    }

    @Override
    public double getShippingCost(){
        return 50.0;
    }
    
}
