package homework;

public class Account {
    protected double amount;

    public Account(double amount) {
        this.amount = amount;
    }

    public void put(double deposit) {
        if (deposit > 0) {
            this.amount += deposit;
        } else {
            throw new IllegalArgumentException("Сумма внесения должна быть положительной");
        }
    }

    public void take(double withdrawal) {
        if (withdrawal > 0 && this.amount >= withdrawal) {
            amount -= withdrawal;
        } else {
            throw new IllegalArgumentException("Сумма снятия должна быть положительной");
        }
    }

    public double getAmount() {
        return amount;
    }
}
