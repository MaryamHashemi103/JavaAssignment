package ExceptionsPractice;

public class MainBankTest {
    static void main() {
        BankAccount account = new BankAccount(4000);
        try{
            account.withdraw(30000);
        }catch (InsufficientBalanceException e){
            System.out.println("Your inventory is not enough. Charge it  ");
        }
    }
}
