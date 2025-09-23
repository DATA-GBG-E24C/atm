package transaction;

import account.IAccount;

public interface ITransactionProcessor {


    boolean checkSufficientFund(IAccount account, int amount);

}
