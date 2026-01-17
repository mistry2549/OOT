package test1.test11;

public class Main {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

       
        myCart.addProduct(new Electronics("TV", 10000));     
        myCart.addProduct(new Clothing("T-Shirt", 500, true)); 
        myCart.addProduct(new Electronics("Mouse", 500)); 

        System.out.println("Total Price: " + myCart.calculateTotal());
        System.out.println("Total Shipping: " + myCart.calculateTotalShipping());
        
    }
}

