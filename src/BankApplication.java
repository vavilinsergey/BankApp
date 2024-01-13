//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Data.AccountManager;
import Services.AccountService;
import Input.CommandInputHandler;
public class BankApplication {
    public static void main(String[] args) {
        // Инициализация AccountManager и AccountService
        AccountManager accountManager = new AccountManager();
        AccountService accountService = new AccountService(accountManager);

        // Создание экземпляра CommandInputHandler и запуск обработки ввода пользователя
        CommandInputHandler commandInputHandler = new CommandInputHandler(accountService);
        commandInputHandler.start();
    }
}