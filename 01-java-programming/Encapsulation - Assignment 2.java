class MovieTicket {

    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    // Constructor
    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }

    // 🔥 Final logic
    public double calculateTotalAmount() {

        boolean validMovie = (movieId == 111 || movieId == 112 || movieId == 113);
        boolean validSeats = (noOfSeats > 0);

        // BOTH invalid
        if (!validMovie && !validSeats) {
            return -1;
        }

        // Any one invalid
        if (!validMovie || !validSeats) {
            return 0;
        }

        // Set cost
        if (movieId == 111) {
            costPerTicket = 7;
        } 
        else if (movieId == 112) {
            costPerTicket = 8;
        } 
        else {
            costPerTicket = 8.5;
        }

        double total = costPerTicket * noOfSeats;
        double finalAmount = total + (total * 0.02);

        return Math.round(finalAmount);
    }
}
