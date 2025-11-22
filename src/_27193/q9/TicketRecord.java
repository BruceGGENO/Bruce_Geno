package _27193.q9;

public class TicketRecord extends Invoice {

    public TicketRecord(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                        String airlineName, String address, String contactEmail,
                        String flightNumber, String destination, java.time.LocalDateTime departureTime,
                        String passengerName, String passportNumber, String nationality,
                        String seatNumber, String seatType,
                        String ticketNumber, double price,
                        double baggageWeight, double baggageFee,
                        java.time.LocalDate paymentDate, String paymentMode,
                        double totalFare) throws AirlineExceptions {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode, totalFare);
    }

    public void displayInvoice() {
        System.out.println("Airline Ticket Records (27193");
        System.out.println("Total: RWF" + getTotalFare() + " (27193)");
    }
}