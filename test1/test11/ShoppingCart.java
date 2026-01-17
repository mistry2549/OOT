package test1.test11;
import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<product> cart = new ArrayList<>();

    public void addProduct(product p){
        cart.add(p);
    }

    public double calculateTotal(){
        double total = 0;

        for(product p : cart){
            total += p.getFinalprice();
        }
        return total;
    }

    public double calculateTotalShipping(){
        double totalShipping = 0;

        for(product p : cart){
            if(p instanceof  Shippable){
                Shippable s = (Shippable) p;
                totalShipping += s.getShippingCost();
            }

        }

        return totalShipping;
    }
    
}
