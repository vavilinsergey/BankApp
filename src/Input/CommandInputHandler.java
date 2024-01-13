package Input;

import Data.AccountManager;
import Data.Account;
import Services.AccountService;
import java.util.Scanner;

public class CommandInputHandler {
    private AccountService accountService;
    private Scanner scanner;

    public CommandInputHandler(AccountService accountService) {
        this.accountService = accountService;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            System.out.print("Enter option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositToAccount();// Логика для депозита
                    break;
                case 3:
                    depositToAccount();// Логика для снятия
                    break;
                case 4:
                    checkBalance();
                    // Логика для проверки баланса
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    return; // Выход из цикла
                default:
                    System.out.println("Invalid option! Please enter again.");
            }
        }
    }
    private void createAccount() {
        System.out.print("Enter Account ID: ");
        String id = scanner.next();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        accountService.createAccount(id, balance);
    }
    private void checkBalance() {
        System.out.print("Enter Account ID: ");
        String id = scanner.next();
        double balance = accountService.checkBalance(id);

        System.out.println("Current balance: " + balance);

    }

    private void depositToAccount() {
        System.out.print("Enter Account ID: ");
        String id = scanner.next();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        accountService.depositToAccount(id, amount);
    }
    private void  withdrawFromAccount() {
        System.out.print("Enter Account ID: ");
        String id = scanner.next();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        accountService.withdrawFromAccount(id, amount);
    }
}

