package _27193.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) throws BkExceptions {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
                customerName, email, phoneNumber);
        if (amount <= 0) throw new BkExceptions("Transaction amount must be > 0 (27193)");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public double getAmount() { return amount; }
}