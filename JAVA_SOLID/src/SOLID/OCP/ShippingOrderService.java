package SOLID.OCP;

public class ShippingOrderService {
    public void checkOut(Product product, Shipping shipping){
        int costShipping = shipping.calculate(product);
    }
}

