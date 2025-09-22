package card;

import account.IAccount;

public interface ICard
{
    public String getCardNumber();
    public String getPin();
    IAccount getAccount();
}
