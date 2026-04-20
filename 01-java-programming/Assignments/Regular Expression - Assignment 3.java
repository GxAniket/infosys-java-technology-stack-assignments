class Shipment {

    public boolean checkProductNameValidity(String productName) {
        // Regex: 2 to 3 words, separated by a single space, alphabets only
        String regex = "^[a-zA-Z]+ [a-zA-Z]+( [a-zA-Z]+)?$";
        return productName != null && productName.matches(regex);
    }

    public boolean checkProductIdValidity(String productId) {
        // Regex: Alphanumeric characters only, length between 2 and 20
        String regex = "^[a-zA-Z0-9]{2,20}$";
        return productId != null && productId.matches(regex);
    }

    public boolean checkTrackerIdValidity(String trackerId) {
        // Regex: 1 Uppercase : 4 Uppercase : 3 Lowercase : 2 Digits
        String regex = "^[A-Z]:[A-Z]{4}:[a-z]{3}:[0-9]{2}$";
        return trackerId != null && trackerId.matches(regex);
    }
}

class Tester {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();

        // Testing Product Name
        String productName = "Digital Camera";
        System.out.println("The product name is " + (shipment.checkProductNameValidity(productName) ? "valid!" : "invalid!"));

        // Testing Product ID
        String productId = "DC1911";
        System.out.println("The product Id is " + (shipment.checkProductIdValidity(productId) ? "valid!" : "invalid!"));

        // Testing Tracker ID
        String trackerId = "D:CMDC:cmd:23";
        System.out.println("The tracker Id is " + (shipment.checkTrackerIdValidity(trackerId) ? "valid!" : "invalid!"));
    }
}