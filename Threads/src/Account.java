import java.util.Random;

public class Account {
    long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    synchronized void depositTo(Account account) {
        long randomAmount = new Random().nextLong();
        account.balance += randomAmount;
        this.balance -= randomAmount;
    }

    synchronized void withdraw() {
        this.balance -= 500;
    }
}
