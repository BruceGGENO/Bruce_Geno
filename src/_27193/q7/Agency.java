package _27193.q7;

public class Agency extends Entity {
    private String agencyName;

    private String location;
    
    private String phoneNumber;


    


    public Agency(int id, String agencyName, String location, String phoneNumber) throws RealExceptions {
        super(id);
        if (!phoneNumber.matches("\\d{10}")) throw new RealExceptions ("Phone must be 10 digits (27193)");
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    
}
    
