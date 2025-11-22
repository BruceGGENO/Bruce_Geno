package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList<Department> departments, String departmentName,
            String departmentCode, String doctorName, String specialization, String doctorEmail, String phone,
            String nurseName, String shift, int yearsOfExperience) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments, departmentName,
                departmentCode, doctorName, specialization, doctorEmail, phone);
        if (!(shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night")))
            System.out.println("Shift must be 'Day' or 'Night' (27193)");
        if (yearsOfExperience < 0)
            System.out.println("Years of experience must be >= 0 (27193)");
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() {
        return nurseName;
    }

    public String getShift() {
        return shift;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}