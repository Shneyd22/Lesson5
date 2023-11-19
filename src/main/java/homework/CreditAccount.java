package homework;

public class CreditAccount extends Account{
    public CreditAccount(double amount) {
        super(amount);
    }

    @Override
    public void take(double withdrawal) {
        this.amount -= withdrawal * 1.01;
    }
}
