package _27193.q3;


public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);

        if (departmentCode.length() < 3) throw new PayrollDataException("Department code >= 3 chars 27193");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}