// Problem Statement
// Implement a recursive method to find the sum of the Harmonic Progression given below.  

// 1+1/2+1/3+1/4+1/5+1/6+…+1/n

// Implement the logic inside findHPSum() method. You need to find the sum based on the value of num passed to the method.

// E.g. - If the value of num is 3, you need to find the sum of 1+1/2+1/3.

// Test the functionalities using the main method of the Tester class. ​

class Tester {

    public static double findHPSum(int num) {
        // Base case: The sequence starts at 1/1, which is 1.0
        if (num == 1) {
            return 1.0;
        }
        
        // Recursive step: (1 / current_num) + sum of the remaining sequence
        // We use 1.0 instead of 1 to ensure decimal (double) division instead of integer division
        return (1.0 / num) + findHPSum(num - 1);
    }

    public static void main(String args[]) {
        // You can change the value passed to findHPSum to test different inputs
        System.out.println(findHPSum(3));
        
        // Testing the second sample input
        System.out.println(findHPSum(6));
    }
}