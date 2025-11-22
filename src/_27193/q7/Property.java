package _27193.q7;
public class Property extends Agent {
    private String propertyCode;

    private String propertyType;
    
    private double price;


    
    public Property(int id, String agencyName, String location, String phoneNumber, String agentName, String email,
            String licenseNumber, String propertyCode, String propertyType, double price) throws RealExceptions {
        super(id, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        if (price <= 0) throw new RealExceptions ("Price must be > 0 (27193)");
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }



    public double getPrice() { return price; }
}