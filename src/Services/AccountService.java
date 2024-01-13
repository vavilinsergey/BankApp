package Services;

import Data.Account;
import Data.AccountManager;

public class AccountService {
    private AccountManager accountManager;

    public AccountService(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public void createAccount(String id, double initialBalance) {
        Account newAccount = new Account(id, initialBalance);
        accountManager.addAccount(newAccount);
        System.out.println("Account created successfully!");
    }
    public double checkBalance(String accountId) {
        Account account = accountManager.getAccount(accountId);
        if (account != null) {
            return account.getBalance();
        } else {
            // Обработка ситуации, когда аккаунт не найден
            System.out.println("Account not found.");
            return -1; // Пример обработки ошибки
        }
    }

    public void depositToAccount (String accountId, double amount) {
        Account account = accountManager.getAccount(accountId);
        if (account != null) {
            account.deposit(amount);
            double balance = checkBalance(accountId);
            System.out.println("Deposited " + amount + " to account " + accountId);
            System.out.println("Current balance is: " + balance);
        }
    }
    public void withdrawFromAccount (String accountId, double amount) {
        Account account = accountManager.getAccount(accountId);
        if (account != null) {
            account.withdraw(amount);
            double balance = checkBalance(accountId);
            System.out.println("Withdrawn " + amount + " from account " + accountId);
            System.out.println("Current balance is: " + balance);
        }
    }
}
