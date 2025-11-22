package _27193.q7;

public class Agent extends Agency {
    private String agentName;
    
    private String email;

    private String licenseNumber;


    public Agent(int id, String agencyName, String location, String phoneNumber, String agentName, String email,
            String licenseNumber) throws RealExceptions {
        super(id, agencyName, location, phoneNumber);
        if (!email.matches("^(.+)@(.+)$")) throw new RealExceptions ("Invalid email (27193)");
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    
}