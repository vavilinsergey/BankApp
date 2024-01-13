package Data;

import Data.Account;

import java.util.HashMap;
import java.util.Map;


public class AccountManager {
    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    public Account getAccount(String id) {
        return accounts.get(id);
    }

    public void removeAccount(String id) {
        accounts.remove(id);
    }

    // Предположим, что у нас есть метод для внесения депозита на счет
    public void deposite(String id, double amount) {
        Account account = getAccount(id);
        if (account != null) {
            account.deposit(amount);
        }
    }
    public void withdraw(String id, double amount) {
        Account account = getAccount(id);
        if (account != null) {
            account.withdraw(amount);
        }
    }

}