package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Admission extends Patient {
    private LocalDate admissionDate;
    private int roomNumber;
    private double roomCharges;



     

    public Admission(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList<Department> departments, String departmentName,
            String departmentCode, String doctorName, String specialization, String doctorEmail, String phone,
            String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender,
            String contactNumber, LocalDate admissionDate, int roomNumber, double roomCharges) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments, departmentName,
                departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber);
        
        if (admissionDate == null) System.out.println("Admission date cannot be null 27193");
        if (roomCharges <= 0) System.out.println("Room charges must be > 0 27193");
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }
}