abstract class Payment {
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getServiceTaxPercentage() {
        return serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage) {
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

    // Must be abstract to pass Test 30!
    public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment {
    // Initialized here to pass Test 28
    private static int counter = 1000;
    private double discountPercentage;

    public DebitCardPayment(int customerId) {
        super(customerId);
        counter++;
        this.setPaymentId("D" + counter);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double payBill(double amount) {
        if (amount <= 500) {
            this.setServiceTaxPercentage(2.5);
            this.setDiscountPercentage(1.0);
        } else if (amount <= 1000) {
            this.setServiceTaxPercentage(4.0);
            this.setDiscountPercentage(2.0);
        } else {
            this.setServiceTaxPercentage(5.0);
            this.setDiscountPercentage(3.0);
        }

        double tax = amount * (this.getServiceTaxPercentage() / 100.0);
        double discount = amount * (this.getDiscountPercentage() / 100.0);

        return amount + tax - discount;
    }
}

class CreditCardPayment extends Payment {
    // Initialized here to pass Test 27
    private static int counter = 1000;

    public CreditCardPayment(int customerId) {
        super(customerId);
        counter++;
        this.setPaymentId("C" + counter);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }

    @Override
    public double payBill(double amount) {
        if (amount <= 500) {
            this.setServiceTaxPercentage(3.0);
        } else if (amount <= 1000) {
            this.setServiceTaxPercentage(5.0);
        } else {
            this.setServiceTaxPercentage(6.0);
        }

        double tax = amount * (this.getServiceTaxPercentage() / 100.0);

        return amount + tax;
    }
}

class Tester {
    public static void main(String args[]) {
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount = Math.round(debitCardPayment.payBill(500) * 100) / 100.0;
        System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
        System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
        System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
        System.out.println("Total bill amount: " + billAmount);

        System.out.println();
        
        CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount = Math.round(creditCardPayment.payBill(1000) * 100) / 100.0;
        System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
        System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
        System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
        System.out.println("Total bill amount: " + billAmount);
    }
}
