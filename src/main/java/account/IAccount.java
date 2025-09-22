package account;

public interface IAccount {
    Customer getOwner();
    void getBalance();
    void withdraw(double amount);
    void deposit(double amount);
}
