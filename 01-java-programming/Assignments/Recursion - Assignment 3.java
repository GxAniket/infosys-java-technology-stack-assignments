// Problem Statement
// Implement a recursive method to find the greatest common divisor (GCD) of two numbers. Implement the logic inside findGCD() method. You can make use of the provided findMax() and findMin() methods for the implementation.

// GCD of two numbers is the largest positive integer that divides each of the numbers.

// Test the functionalities using the main method of the Tester class.

class Tester {

    public static int findGCD(int num1, int num2) {
        // Find the larger and smaller of the two current numbers
        int max = findMax(num1, num2);
        int min = findMin(num1, num2);
        
        // Base case: If the smaller number is 0, the GCD is the larger number
        if (min == 0) {
            return max;
        }
        
        // Recursive step: Call findGCD with the smaller number and the remainder
        return findGCD(min, max % min);
    }

    public static int findMax(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static int findMin(int num1, int num2) {
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String args[]) {
        // Testing the sample inputs
        System.out.println(findGCD(12, 10)); // Expected Output: 2
        System.out.println(findGCD(5, 10));  // Expected Output: 5
    }
}