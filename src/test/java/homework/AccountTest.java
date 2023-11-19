package homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

;

class AccountTest {

    @Test
    void Test1(){
        Account account = new Account(2);
        account.put(10);
        double currentAmount = account.getAmount();
        double expectedAmount = 12;

        Assertions.assertEquals(currentAmount, expectedAmount);
    }

    @Test
    void Test2(){
        Account account = new Account(3);
        account.put(9);
        account.take(5);
        double currentAmount = account.getAmount();
        double expectedAmount = 7;

        Assertions.assertEquals(currentAmount, expectedAmount);
    }

    @Test
    void Test3(){
        Account creditAccount = new CreditAccount(0);
        creditAccount.put(10);
        creditAccount.take(5);
        double currentAmount = creditAccount.getAmount();
        double expectedAmount = 4.95;

        Assertions.assertEquals(currentAmount, expectedAmount);
    }

}