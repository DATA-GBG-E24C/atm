package account;

public class Account implements IAccount {

    double balance;
    ICustomer owner;
    ICard card;

    public Account (Customer owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }



    @Override
    public ICustomer getOwner() {
        return owner;
    }

    @Override
    public void getBalance() {
        System.out.println("Your balance is: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println(amount + " has been withdrawed.");
            System.out.println("Your new balance is: " + balance);
        }

    }

    @Override
    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Thats not a lot of money, try again ");
        } else {
            balance += amount;
            System.out.println(amount + " has been added to your account");
            System.out.println("Your new balance is: " + balance);

        }
    }
}
