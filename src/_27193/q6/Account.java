package _27193.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) throws BkExceptions {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (balance < 0) throw new BkExceptions("Balance shouldn't  be negative (27193)");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}