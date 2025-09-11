package review;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(int[] deposits){
        for(int i=0; i<deposits.length; i++){
            if(deposits[i] > 0){
                this.balance += deposits[i];
            }
        }
    }

    public void withdraw(int[] withdrawals){
        for(int i=0; i<withdrawals.length; i++){
                if(withdrawals[i] > 0 && this.balance >= withdrawals[i]) {
                    this.balance -= withdrawals[i];
                }
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
