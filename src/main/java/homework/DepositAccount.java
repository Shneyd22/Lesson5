package homework;

import java.time.LocalDate;

public class DepositAccount extends Account{
    private LocalDate lastWithdrawalDate = LocalDate.of(1980, 1, 1);
    private LocalDate now = LocalDate.now();
    public DepositAccount(int amount) {
        super(amount);
    }

    @Override
    public void take(double withdrawal) {
        if (this.lastWithdrawalDate.isBefore(this.now.minusMonths(1))){
            super.take(withdrawal);
            lastWithdrawalDate = LocalDate.now();
        }
        else {
            throw new IllegalArgumentException("Нельзя снимать средства чаще, чем раз в месяц");
        }
    }
}
