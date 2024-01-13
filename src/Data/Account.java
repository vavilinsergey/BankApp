package Data;

import java.util.HashMap;
import java.util.Map;
public class Account {
    private String id;
    private double balance;
    // Дополнительные поля...

    public Account(String id, double initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        // Возможно добавление логики валидации
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
        // Возможно добавление логики валидации
    }

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

}
