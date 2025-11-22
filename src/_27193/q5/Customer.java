package _27193.q5;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber) throws VehDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate);
        if (licenseNumber.isEmpty()) throw new VehDataException("License shouldn't be empty 27193");
        if (!contactNumber.matches("\\d{10}")) throw new VehDataException("Contact should be 10 digits 27193");
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }
}