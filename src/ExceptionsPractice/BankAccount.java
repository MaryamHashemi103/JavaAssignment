package ExceptionsPractice;

public class BankAccount {
    private double balance;
    BankAccount(double balance){
        this.balance = balance ;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Your Balance is not enough");
        }
        balance = balance - amount;
        System.out.println("Successful Withdraw. new inventory: "+ balance);
    }
}
