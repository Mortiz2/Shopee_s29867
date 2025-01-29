package pl.pjatk.shopee_s29867;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {
    @Test
    void shouldCompleteOrderWhenEnoughBalance() {
        ProductStorage productStorage = new ProductStorage();
        productStorage.addProduct(new Product("milk", 3.99));
        productStorage.addProduct(new Product("beer", 4.49));

        Customer customer = new Customer(1, 100.0);
        Cart cart = new Cart(customer);
        cart.addItemToCart("milk");
        cart.addItemToCart("beer");

        CartService cartService = new CartService(productStorage);
        boolean result = cartService.makeOrder(cart);

        assertTrue(result);
        assertEquals(91.52, customer.getBalance());
    }

    @Test
    void shouldDeclineOrderWhenNotEnoughBalance() {
        ProductStorage productStorage = new ProductStorage();
        productStorage.addProduct(new Product("beer", 4.49));

        Customer customer = new Customer(1, 2.50);
        Cart cart = new Cart(customer);
        cart.addItemToCart("beer");

        CartService cartService = new CartService(productStorage);
        boolean result = cartService.makeOrder(cart);

        assertFalse(result);
        assertEquals(2.50, customer.getBalance());
    }
}
