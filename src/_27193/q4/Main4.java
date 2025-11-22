package _27193.q4;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main4 {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    
    private static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{10}");
    }
    
    private static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 27143;


        System.out.print("Enter Hotel Name: ");
        String hotelName = sc.nextLine();
        if (hotelName == null || hotelName.trim().isEmpty()) {
            throw new IllegalArgumentException("Hotel name shouldn't be null");
        }
        
        System.out.print("Enter Hotel Address: ");
        String address = sc.nextLine();
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address shouldn't be null");
        }
        
        System.out.print("Enter Hotel Phone Number (10 digits): ");
        String phone = sc.nextLine();
        if (!isValidPhone(phone)) {
            throw new IllegalArgumentException("Hotel phone should be  10 digits");
        }
        
        System.out.print("Enter Hotel Email: ");
        String email = sc.nextLine();
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email is invalid");
        }

        System.out.print("Enter Room Number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();
        if (roomNumber <= 0) {
            throw new IllegalArgumentException("Room number shouldn't be negative");
        }
        
        System.out.print("Enter Room Type: ");
        String roomType = sc.nextLine();
        if (roomType == null || roomType.trim().isEmpty()) {
            throw new IllegalArgumentException("Room type shouldn't be null");
        }
        
        System.out.print("Enter Price per Night (>0): ");
        double price = sc.nextDouble();
        sc.nextLine();
        if (price <= 0) {
            throw new IllegalArgumentException("Price per night must be positive");
        }


        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null");
        }
        
        System.out.print("Enter Customer Email: ");
        String customerEmail = sc.nextLine();
        if (!isValidEmail(customerEmail)) {
            throw new IllegalArgumentException("Email is invalid");
        }
        
        System.out.print("Enter Customer Contact (10 digits): ");
        String customerContact = sc.nextLine();
        if (!isValidPhone(customerContact)) {
            throw new IllegalArgumentException("Customer contact should be 10 digits");
        }


        LocalDate bookingDate = LocalDate.now();
        System.out.print("Enter Check-In Date (YYYY-MM-DD): ");
        LocalDate checkIn = LocalDate.parse(sc.nextLine());
        if (checkIn.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Check-in date cannot be in the past");
        }
        
        System.out.print("Enter Check-Out Date (YYYY-MM-DD): ");
        LocalDate checkOut = LocalDate.parse(sc.nextLine());
        if (checkOut.isBefore(checkIn) || checkOut.equals(checkIn)) {
            throw new IllegalArgumentException("Check-out date must be after check-in date");
        }


        System.out.print("Enter Service Name: ");
        String serviceName = sc.nextLine();
        if (serviceName == null || serviceName.trim().isEmpty()) {
            throw new IllegalArgumentException("Service name shouldn't be empty");
        }
        
        System.out.print("Enter Service Cost (>0): ");
        double serviceCost = sc.nextDouble();
        sc.nextLine();
        if (serviceCost <= 0) {
            throw new IllegalArgumentException("Service cost must be positive");
        }


        System.out.print("Enter Payment Method: ");
        String paymentMethod = sc.nextLine();
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new IllegalArgumentException("Payment method shouldn't be empty");
        }
        LocalDate paymentDate = LocalDate.now();


        System.out.print("Enter Room Charge: ");
        double roomCharge = sc.nextDouble();
        if (roomCharge < 0) {
            throw new IllegalArgumentException("Room charge shouldn't be negative");
        }
        
        System.out.print("Enter Service Charge: ");
        double serviceCharge = sc.nextDouble();
        sc.nextLine();
        if (serviceCharge < 0) {
            throw new IllegalArgumentException("Service charge shouldn't be negative");
        }


        System.out.print("Enter Rating (1-5): ");
        int rating = sc.nextInt();
        sc.nextLine();
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rate between 1 and 5");
        }
        
        System.out.print("Enter Comments: ");
        String comments = sc.nextLine();
        if (comments == null || comments.trim().isEmpty()) {
            throw new IllegalArgumentException("Comments shouldn't be empty");
        }


        ReservationRecord record = new ReservationRecord(
                id, hotelName, address, phone, email,
                roomNumber, roomType, price,
                customerName, customerEmail, customerContact,
                bookingDate, checkIn, checkOut,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge,
                rating, comments
        );

        System.out.println();
        record.generateReservationReport();
        sc.close();
    }
}