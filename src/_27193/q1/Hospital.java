package _27193.q1;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;
    private ArrayList<Department> departments;



    
    public Hospital(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address, String phoneNumber,
            String email, ArrayList<Department> departments) {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}"))
            System.out.println("Phone must be 10 digits (27193)");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", email))
            System.out.println("Invalid email format (27193)");
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.departments = departments;
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName + " 27193");
        System.out.println("Address: " + address + " 27193");
        System.out.println("Phone: " + phoneNumber + " 27193");
        System.out.println("Email: " + email + " 27193");
    }
}