class Bill {

    // Method 1: Find price using itemId
    public double findPrice(int itemId) {

        if (itemId == 1001)
            return 25;
        else if (itemId == 1002)
            return 20;
        else if (itemId == 1003)
            return 23;
        else if (itemId == 1004)
            return 18;
        else
            return 0;
    }

    // Method 2: Find price using brandName, itemType, size
    public double findPrice(String brandName, String itemType, int size) {

        // Puma
        if (brandName.equalsIgnoreCase("Puma")) {
            if (itemType.equalsIgnoreCase("T-shirt") && (size == 34 || size == 36))
                return 25;
            else if (itemType.equalsIgnoreCase("Skirt") && (size == 38 || size == 40))
                return 20;
        }

        // Reebok
        else if (brandName.equalsIgnoreCase("Reebok")) {
            if (itemType.equalsIgnoreCase("T-shirt") && (size == 34 || size == 36))
                return 23;
            else if (itemType.equalsIgnoreCase("Skirt") && (size == 38 || size == 40))
                return 18;
        }

        // Invalid case
        return 0;
    }
}
class Tester {

	public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
	
}
