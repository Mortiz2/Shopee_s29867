package pl.pjatk.shopee_s29867;

import org.springframework.stereotype.Component;

@Component
public class CartService {
    private final ProductStorage productStorage;

    public CartService(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    public boolean makeOrder(Cart cart) {
        double totalPrice = 0;

        for (String productName : cart.getItems()) {
            Product product = productStorage.findProduct(productName).orElse(null);
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }

        Customer customer = cart.getCustomer();
        if (customer.getBalance() >= totalPrice) {
            customer.deductFromBalance(totalPrice);
            return true;
        }
        return false;
    }
}
