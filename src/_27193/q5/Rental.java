package _27193.q5;


import java.time.LocalDate;

public class Rental extends Customer {
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private int rentalDays;

    public Rental(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  LocalDate rentalDate, LocalDate returnDate, int rentalDays) throws VehDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber);
        if (rentalDays <= 0) throw new VehDataException("Rental days must be > 0 (27193)");
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public int getRentalDays() { return rentalDays; }
}