package card;

//import account package

public class card implements Icard
{
    private String cardNumber;
    private int pin;
    //private Account Account;

    public card(String cardNumber, int pin)
    {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public card()
    {
    }

    public String getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public Account getAccount()
    {
        return account;
    }

    public int getPin()
    {
        return pin;
    }

    public void setPin(int pin)
    {
        this.pin = pin;
    }
}
