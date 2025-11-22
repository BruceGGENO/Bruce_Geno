package _27193.q3;

import java.util.regex.Pattern;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String managerName, String managerEmail, String phone) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);

        if (managerName.isEmpty()) throw new PayrollDataException("Manager name should not be empty 27193");
        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$", managerEmail))
            throw new PayrollDataException("Email is invvalid 27193");
        if (!phone.matches("\\d{10}")) throw new PayrollDataException("Phone must be 10 digits 27193");

        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    public String getManagerName() {
        return managerName;
    }
}