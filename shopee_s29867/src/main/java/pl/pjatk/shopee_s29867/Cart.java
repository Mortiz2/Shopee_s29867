package pl.pjatk.shopee_s29867;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Customer customer;
    private List<String> items;

    public Cart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public void addItemToCart (String itemName) {
        items.add(itemName);
    }
}
