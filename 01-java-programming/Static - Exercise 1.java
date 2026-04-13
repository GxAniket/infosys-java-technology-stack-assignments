class Bill {

    private static int counter;
    private String billId;
    private String paymentMode;

    // Static block
    static {
        counter = 9000;
    }

    // Constructor
    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
        counter++;
        this.billId = "B" + counter;
    }

    // Getter for billId
    public String getBillId() {
        return billId;
    }

    // Setter for billId
    public void setBillId(String billId) {
        this.billId = billId;
    }

    // Getter for paymentMode
    public String getPaymentMode() {
        return paymentMode;
    }

    // Setter for paymentMode
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    // Getter for counter
    public static int getCounter() {
        return counter;
    }
}

class Tester {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");

        Bill[] bills = { bill1, bill2 };

        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}
