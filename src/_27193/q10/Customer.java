package _27193.q10;

public class Customer extends Entity {
    private String customerName;
    private String contactNumber;
    private String address;

    public Customer(int id, String customerName, String contactNumber, String address) {
        super(id);
        setCustomerName(customerName);
        setContactNumber(contactNumber);
        setAddress(address);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) throw new IllegalArgumentException("customerName cannot be empty (27193)");
        this.customerName = customerName.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) {
        if (contactNumber == null || contactNumber.trim().isEmpty()) throw new IllegalArgumentException("contactNumber cannot be empty (27193)");
        this.contactNumber = contactNumber.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) throw new IllegalArgumentException("address cannot be empty (27193)");
        this.address = address.trim();
        this.updatedDate = java.time.LocalDateTime.now();
    }

    
    public String toString() {
        return "Customer{" +"id=" + id +", customerName='" + customerName + '\'' +", contactNumber='" + contactNumber + '\'' + ", address='" + address + '\'' + '}';
    }
}