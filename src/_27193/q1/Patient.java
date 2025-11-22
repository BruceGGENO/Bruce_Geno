package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient extends Nurse {
    private String patientName;
    private int age;
    private String gender;
    private String contactNumber;


    

    public Patient(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList<Department> departments, String departmentName,
            String departmentCode, String doctorName, String specialization, String doctorEmail, String phone,
            String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender,
            String contactNumber) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments, departmentName,
                departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience);
        if (age <= 0) System.out.println("Age must be > 0 27197");
        if (!(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other")))
            System.out.println("Gender must be Male/Female/Other 27197");
        if (!contactNumber.matches("\\d{10}")) System.out.println("Contact must be 10 digits 27197");
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}