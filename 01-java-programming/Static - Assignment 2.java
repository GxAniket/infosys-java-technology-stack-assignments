class Participant {

    private String name;
    private long contactNumber;
    private String city;
    private String registrationId;

    private static int counter;

    // Static block
    static {
        counter = 10001;
    }

    // Constructor
    public Participant(String name, long contactNumber, String city) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.city = city;

        this.registrationId = "D" + counter;
        counter++;
    }

    // 🔥 REQUIRED METHODS (you missed these)
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Participant.counter = counter;
    }

    // Getters
    public String getName() {
        return name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getCity() {
        return city;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
