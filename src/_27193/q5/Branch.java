package _27193.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws VehDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);
        if (locationCode.length() < 3) throw new VehDataException("Location should be greater than 3 chars 27193");
        this.branchName = branchName;
        this.locationCode = locationCode;
    }
}