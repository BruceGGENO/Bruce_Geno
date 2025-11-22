package _27193.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String bankName, String branchCode, String address) throws BkExceptions {
        super(id, createdDate, updatedDate);
        if (branchCode.length() < 3) throw new BkExceptions("Branch code should be greater than or equal to 3 characters (27193)");
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }
}