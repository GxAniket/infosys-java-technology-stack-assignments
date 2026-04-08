class Calculator {

    public double findAverage(int number1, int number2, int number3) {
        
        double avg = (number1 + number2 + number3) / 3.0;
        
        // Round off to 2 decimal places
        avg = Math.round(avg * 100.0) / 100.0;
        
        return avg;
    }
}

// Tester class
public class Tester {
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        
        System.out.println(calc.findAverage(12, 8, 15));   // 11.67
        System.out.println(calc.findAverage(10, 20, 30));  // 20.0
    }
}