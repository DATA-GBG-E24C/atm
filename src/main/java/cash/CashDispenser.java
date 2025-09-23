package cash;

public class CashDispenser implements ICashDispenser
{
    @Override
    public void dispenseCash(double amount)
    {
        System.out.println("Dispensed $" + String.format("%.2f",amount));
    }
}
