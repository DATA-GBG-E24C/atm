package transaction;

public class TransactionProcessor implements ITransactionProcessor {
    /**
     * Hvis den returnerer true kan withdrawMoney() kaldes
     */
    public boolean checkSufficientFund(Account account, int  amount) {
        //TODO tjek med customer.getFunds();
        if(amount>customer.getFunds()){
            System.out.println("Insufficient funds");
            return false;
        }
        else{
            return true;
            //TODO træk "amount" fra customer account
        }
    }
}
