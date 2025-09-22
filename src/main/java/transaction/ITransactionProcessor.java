package transaction;

public interface ITransactionProcessor {


    boolean checkSufficientFund(Account account, int amount);


}
