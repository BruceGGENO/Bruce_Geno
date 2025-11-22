package _27193.q9;

import java.time.LocalDate;

public class Payment extends Baggage {
    private LocalDate paymentDate;
    private String paymentMode;

    public Payment(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, java.time.LocalDateTime departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee,
                   LocalDate paymentDate, String paymentMode) throws AirlineExceptions {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        if (paymentDate == null || paymentMode.isEmpty()) throw new AirlineExceptions("Payment info cannot be empty (27193)");
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public LocalDate getPaymentDate() { return paymentDate; }
}