package card;

import account.*;


//import account package

public class Card implements ICard {


    private String cardNumber;
    private String pin;
    private IAccount account;

    public Card(String cardNumber, String pin, IAccount account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public Card() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public IAccount getAccount() {
        return account;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}