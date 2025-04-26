import java.util.ArrayList;

public class Bank {
    long sumOfAll = 100000;
    ArrayList<Account> accounts;

    Bank(Account account1, Account account2) {
        this.accounts.add(account1);
        this.accounts.add(account2);
    }
}
