package _27193.q5;


public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber) throws VehDataException {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}")) throw new VehDataException("Phone must be 10 digits 27193");
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}