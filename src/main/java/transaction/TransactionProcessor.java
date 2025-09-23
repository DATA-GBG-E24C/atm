package transaction;

import account.IAccount;
import customer.Customer;

public class TransactionProcessor implements ITransactionProcessor {
    /**
     * Hvis den returnerer true kan withdrawMoney() kaldes
     */
    public boolean checkSufficientFund(IAccount account, int  amount) {
        //TODO tjek med customer.getFunds();
        if(amount > account.getBalance()){
            System.out.println("Insufficient funds");
            return false;
        } else{
            return true;
            //TODO træk "amount" fra customer account
        }
    }
}
