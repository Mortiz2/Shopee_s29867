package pl.pjatk.shopee_s29867;

import java.util.List;

public class Customer {
    private int id;
    private double balance;

    public Customer(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deductFromBalance(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void addToBalance(double amount) {
        balance += amount;
    }
}
