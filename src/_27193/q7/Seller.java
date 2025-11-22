package _27193.q7;
public class Seller extends Property {
    private String sellerName;
    private String contactNumber;


    public Seller(int id, String agencyName, String location, String phoneNumber, String agentName, String email,
            String licenseNumber, String propertyCode, String propertyType, double price, String sellerName,
            String contactNumber) throws RealExceptions {
        super(id, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType,
                price);
            if (sellerName.isEmpty() || contactNumber.isEmpty())
            throw new RealExceptions ("Seller name/contact cannot be empty (27193)");
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    
}