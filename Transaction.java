import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String type;
    private final double amount;
    private final Date timestamp;
    private final String accountId;

    public Transaction(String type, double amount, String accountId) {
        this.type = type;
        this.amount = amount;
        this.accountId = accountId;
        this.timestamp = new Date();
    }

    @Override
    public String toString() {
        return String.format("[%s] %s: $%.2f (Acc: %s)", timestamp, type, amount, accountId);
    }
}