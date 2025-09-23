package account;

import customer.ICustomer;

public interface IAccount {
    ICustomer getOwner();
    double getBalance();
    void withdraw(double amount);
    void deposit(double amount);
}
