// User-defined exception classes
class InvalidCouponCodeException extends Exception {
    public InvalidCouponCodeException(String message) {
        super(message);
    }
}

class InvalidDestinationException extends Exception {
    public InvalidDestinationException(String message) {
        super(message);
    }
}

class InvalidTripPackageException extends Exception {
    public InvalidTripPackageException(String message) {
        super(message);
    }
}

class BusBooking {

    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage) {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
        this.totalAmount = 0;
    }

    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException {
        if ((couponCode.equals("BIGBUS") && numberOfMembers >= 10) ||
            (couponCode.equals("MAGICBUS") && numberOfMembers >= 15)) {
            return true;
        } else {
            throw new InvalidCouponCodeException("Invalid coupon code");
        }
    }

    public String bookTrip(String couponCode, int numberOfMembers) {
        try {
            // Validate Destination
            if (!(destination.equals("Washington DC") ||
                  destination.equals("Philadelphia") ||
                  destination.equals("Orlando") ||
                  destination.equals("Boston") ||
                  destination.equals("Atlanta"))) {
                throw new InvalidDestinationException("Invalid destination");
            }

            // Validate Trip Package
            if (!(tripPackage.equals("Regular") || tripPackage.equals("Premium"))) {
                throw new InvalidTripPackageException("Invalid package");
            }

            // Validate Coupon Code
            validateCouponCode(couponCode, numberOfMembers);

            // Calculate Total Amount
            if (tripPackage.equals("Regular")) {
                this.totalAmount = numberOfMembers * 500.0;
            } else if (tripPackage.equals("Premium")) {
                this.totalAmount = numberOfMembers * 800.0;
            }

            return "Booking successful";

        } catch (InvalidDestinationException | InvalidTripPackageException | InvalidCouponCodeException e) {
            // Handle all custom exceptions and return their messages
            return e.getMessage();
        }
    }

    // --- Missing Getters and Setters Added Below ---

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

class Tester {
    public static void main(String[] args) {
        BusBooking booking = new BusBooking(101, "Orlando", "Regular");
        String result = booking.bookTrip("BIGBUS", 11);
        
        if (result.equals("Booking successful")) {
            System.out.println(result);
            System.out.println("Total amount for the trip: " + booking.getTotalAmount());
        } else {
            System.out.println(result);
            System.out.println("Your booking was not successful, please try again!");
        }
    }
}
