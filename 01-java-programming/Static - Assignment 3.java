class Booking {

    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;

    private static int seatsAvailable;

    // 🔥 Static block (initialize total seats)
    static {
        seatsAvailable = 400;
    }

    // Constructor
    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;

        if (seatsRequired <= seatsAvailable) {
            isBooked = true;
            seatsAvailable -= seatsRequired;
        } else {
            isBooked = false;
        }
    }

    // Getters
    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getSeatsRequired() {
        return seatsRequired;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public static int getSeatsAvailable() {
        return seatsAvailable;
    }

    // Setters
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public static void setSeatsAvailable(int seatsAvailable) {
        Booking.seatsAvailable = seatsAvailable;
    }
}
