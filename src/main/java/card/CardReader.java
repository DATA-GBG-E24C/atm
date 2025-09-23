package card;

import account.Account;
import card.ICardReader;
import customer.Customer;
import customer.ICustomer;

import java.util.HashMap;
import java.util.Map;

public class CardReader implements ICardReader {
    ICustomer customer1 = new Customer(1, "John Doe");
    ICustomer customer2 = new Customer(2, "Jane Smith");


    private final Map<String, ICard> validCards = new HashMap<String, ICard>()
    {{
        put("1234567890123456", new Card("1234567890123456", "1234", new Account(customer1, 1000)));
        put("9876543210987654", new Card( "9876543210987654", "4321", new Account(customer2, 2000)));
    }};

    public ICard validateCard(String cardNumber) {
        if (cardNumber != null && validCards.containsKey(cardNumber)) {
            return validCards.get(cardNumber);
        }
        return null;
    }
}