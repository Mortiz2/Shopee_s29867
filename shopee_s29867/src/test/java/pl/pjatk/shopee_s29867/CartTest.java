package pl.pjatk.shopee_s29867;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {
    @Test
    void shouldAddItemsToCart() {
        Customer customer = new Customer(1, 100.0);
        Cart cart = new Cart(customer);
        cart.addItemToCart("milk");
        cart.addItemToCart("beer");

        assertEquals(2, cart.getItems().size());
    }
}
