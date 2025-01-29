package pl.pjatk.shopee_s29867;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void shouldDeductBalanceWhenEnoughFunds() {
        Customer customer = new Customer(1, 150.0);
        customer.deductFromBalance(50.0);
        assertEquals(100.0, customer.getBalance());
    }

    @Test
    void shouldNotAllowNegativeBalance() {
        Customer customer = new Customer(1, 30.0);
        customer.deductFromBalance(50.0);
        assertEquals(30.0, customer.getBalance());
    }
}
