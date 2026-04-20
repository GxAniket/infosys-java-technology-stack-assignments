class Tester {

    public static int findFibonacci(int n) {
        // Base case 1: The 1st number in the series is 0
        if (n == 1) {
            return 0;
        }
        
        // Base case 2: The 2nd number in the series is 1
        if (n == 2) {
            return 1;
        }
        
        // Recursive step: sum of the previous two numbers
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

    public static void main(String args[]) {
        // You can change 'n' to test different inputs (e.g., 1, 5, etc.)
        int n = 5; 
        
        if (n != 0) {
            System.out.println(findFibonacci(n));
        } else {
            System.out.println("Please enter a valid value for n");
        }
    }
}

// Problem Statement
// Implement a recursive method to generate the nth Fibonacci number.

// The Fibonacci series consists of the first two numbers as 0 and 1 and the subsequent numbers are the sum of the previous two numbers. Implement the logic inside findFibonacci() method.

// Fibonacci numbers – 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, … 

// Test the functionalities using the main method of the Tester class.

 