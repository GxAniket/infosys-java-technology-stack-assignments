// What is Abstraction?
// Abstraction is the concept of hiding internal implementation details and showing only the essential features to the user.

class Customer {

    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void payBill(double totalPrice, double discount) {

        System.out.println("Calculating final amount to be paid.....");

        double finalAmount = totalPrice * (1 - discount / 100);

        System.out.println("Hi " + customerName + 
            ", your final bill amount after discount is " + 
            (int)(finalAmount * 100) / 100.0);
    }
}

class Tester {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerName("Jack");

        customer.payBill(500, 5);
    }
}
