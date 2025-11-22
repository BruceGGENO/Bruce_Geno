package _27193.q7;
public class Buyer extends Seller {
    private String buyerName;
    
    private String email;


    public Buyer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String agencyName, String location, String phoneNumber,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String email) throws RealExceptions  {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber,
                propertyCode, propertyType, price, sellerName, contactNumber);
        if (!email.matches("^(.+)@(.+)$")) throw new RealExceptions ("Invalid buyer email (27193)");
        this.buyerName = buyerName;
        this.email = email;
    }
}