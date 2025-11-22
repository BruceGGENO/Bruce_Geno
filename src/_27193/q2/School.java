package _27193.q2;

import java.util.regex.Pattern;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String schoolName, String address, String phoneNumber, String email) throws SchoolDataException {
        super(id, createdDate, updatedDate);

        if (!phoneNumber.matches("\\d{10}"))
            throw new SchoolDataException("Phone must be 10 digits 27193");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", email))
            throw new SchoolDataException("Invalid email format 27193");

        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void displaySchoolDetails() {
        System.out.println("School Name: " + schoolName + " 27193");
        System.out.println("Address: " + address + " 27193");
        System.out.println("Phone: " + phoneNumber + " 27193");
        System.out.println("Email: " + email + " 27193");
    }
}