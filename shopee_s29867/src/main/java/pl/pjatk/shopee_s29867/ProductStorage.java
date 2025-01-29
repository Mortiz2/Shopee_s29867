package pl.pjatk.shopee_s29867;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductStorage {
    private final List<Product> products = new ArrayList<>();

    public ProductStorage() {
        products.add(new Product("milk", 3.99));
        products.add(new Product("beer", 4.49));
    }

    public Optional<Product> findProduct(String name) {
        return products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
