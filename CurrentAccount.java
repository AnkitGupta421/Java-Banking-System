public class CurrentAccount extends BankAccount {
    private final double overdraftLimit = 1000.0;

    public CurrentAccount(String accNum, String pin, String name, double bal) {
        super(accNum, pin, name, bal);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < -overdraftLimit) {
            throw new InsufficientFundsException("Withdrawal failed: Exceeds overdraft limit.");
        }
        balance -= amount;
    }
}