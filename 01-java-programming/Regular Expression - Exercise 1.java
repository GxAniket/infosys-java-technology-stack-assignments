class Tester {

    public static boolean checkNameValidity(String name) {
        // Regex pattern to validate the name based on all conditions
        String regex = "^(?=.{2,30}$)[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)*$";
        
        // The matches() method automatically checks the entire string against the regex
        return name != null && name.matches(regex);
    }
    
    public static void main(String[] args) {
        // Change the value of name for testing your code with different names
        String name1 = "Roger Federer";
        System.out.println("The name is " + (checkNameValidity(name1) ? "valid!" : "invalid!"));      
        
        String name2 = "roger federer";
        System.out.println("The name is " + (checkNameValidity(name2) ? "valid!" : "invalid!"));   
    }
}


// Problem Statement

// Validate the name based on the below conditions using regular expression in the checkNameValidity() method.

// The length of the name should be between 2 and 30 characters (both inclusive)

// The name can contain only alphabets and spaces

// The first character of each word of the name should be an upper case alphabet

// Each word should be separated by a space

// The name should not start or end with a space

// Special characters should not be allowed

// Return true if the name is valid, else return false.

// Test the functionalities using the main method of the Tester class.
