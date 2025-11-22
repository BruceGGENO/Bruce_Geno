package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bill extends Treatment {
    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    

    public Bill(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList departments,String departmentName,
            String departmentCode, String doctorName, String specialization, String doctorEmail, String phone,
            String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender,
            String contactNumber, LocalDate admissionDate, int roomNumber, double roomCharges, String diagnosis,
            String treatmentGiven, double treatmentCost, double doctorFee, double medicineCost, double totalBill) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments, departmentName,
                departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges, diagnosis,
                treatmentGiven, treatmentCost);
        if (doctorFee <= 0 || medicineCost <= 0)
            System.out.println("Doctor fee and medicine cost must be > 0 (27193)");
        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
        this.totalBill = totalBill;
        generateBill();
    }

    private void generateBill() {
        totalBill = getRoomCharges() + getTreatmentCost() + doctorFee + medicineCost;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void displayBill() {
        System.out.println("Patient: " + getPatientName() + " (27193)");
        System.out.println("Room Charges: $" + getRoomCharges() + " (27193)");
        System.out.println("Treatment Cost: $" + getTreatmentCost() + " (27193)");
        System.out.println("Doctor Fee: $" + doctorFee + " (27193)");
        System.out.println("Medicine Cost: $" + medicineCost + " (27193)");
        System.out.println("Total Bill: $" + totalBill + " (27193)");
    }
}