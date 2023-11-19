package homework;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0);
        System.out.println(account.getAmount());
        account.put(10);
        System.out.println(account.getAmount());
        account.take(6);
        System.out.println(account.getAmount());
        CreditAccount creditAccount = new CreditAccount(0);
        creditAccount.take(5);
        System.out.println(creditAccount.getAmount());
        DepositAccount depositAccount = new DepositAccount(0);
        depositAccount.put(10);
        depositAccount.take(4);
        System.out.println(depositAccount.getAmount());
        depositAccount.take(2);
    }
}