package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    

    public Doctor(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList<Department> departments, String departmentName,
            String departmentCode, String doctorName, String specialization, String doctorEmail, String phone) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments, departmentName,
                departmentCode);
            if (specialization.isEmpty()) System.out.println("Specialization cannot be empty (27193)");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", doctorEmail))
            System.out.println("Invalid doctor email (27193)");
        if (!phone.matches("\\d{10}")) System.out.println("Phone must be 10 digits (27193)");
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }
}