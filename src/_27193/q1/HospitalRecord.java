package _27193.q1;
public class HospitalRecord extends Bill {
    public HospitalRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                          String hospitalName, String address, String phoneNumber, String email,
                          String departmentName, String departmentCode,
                          String doctorName, String specialization, String doctorEmail, String doctorPhone,
                          String nurseName, String shift, int yearsOfExperience,
                          String patientName, int age, String gender, String contactNumber,
                          java.time.LocalDate admissionDate, int roomNumber, double roomCharges,
                          String diagnosis, String treatmentGiven, double treatmentCost,
                          double doctorFee, double medicineCost, double totalBill) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode,
                doctorName, specialization, doctorEmail, doctorPhone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost, totalBill);
    }



    public void displayFullRecord() {
        System.out.println("Hospital Records (27193 )");
        displayBill();
    }
}
