package pl.pjatk.shopee_s29867;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

public class ProductStorageTest {

    @Test
    void shouldFindProductByName() {
        ProductStorage productStorage = new ProductStorage();
        Optional<Product> product = productStorage.findProduct("milk");

        assertTrue(product.isPresent());
        assertEquals("milk", product.get().getName());
    }

    @Test
    void shouldReturnEmptyIfProductNotFound() {
        ProductStorage productStorage = new ProductStorage();
        Optional<Product> product = productStorage.findProduct("chocolate milk");

        assertFalse(product.isPresent());
    }
}
