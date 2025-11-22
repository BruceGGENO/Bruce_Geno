package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    
    public Treatment(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList<Department> departments, String departmentName,
            String departmentCode, String doctorName, String specialization, String doctorEmail, String phone,
            String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender,
            String contactNumber, LocalDate admissionDate, int roomNumber, double roomCharges, String diagnosis,
            String treatmentGiven, double treatmentCost) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments, departmentName,
                departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
       if (treatmentCost <= 0 || diagnosis.isEmpty() || treatmentGiven.isEmpty())
            System.out.println("Invalid treatment details 27197");
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }


    public double getTreatmentCost() {
        return treatmentCost;
    }
}