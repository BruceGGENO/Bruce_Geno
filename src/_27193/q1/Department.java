package _27193.q1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Department extends Hospital {
    private String departmentName;
    private String departmentCode;


    public Department(int id, LocalDate createdDate, LocalDate updatedDate, String hospitalName, String address,
            String phoneNumber, String email, ArrayList<Department> departments, String departmentName,
            String departmentCode) {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departments);
        if (departmentCode.length() < 3) System.out.println("Code must be >= 3 chars");
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