// Implement a recursive method to count the occurrences of a given substring in a given string. Implement the logic inside countSubstring() method.

// Perform case-sensitive comparison.

// Test the functionalities using the main method of the Tester class.

class Tester {

    public static int countSubstring(String inputString, String substring, int count) {
        // Edge case protection: check for null or empty strings
        if (inputString == null || substring == null || substring.isEmpty()) {
            return count;
        }

        // Find the first occurrence of the substring
        int index = inputString.indexOf(substring);

        // Base case: If the substring is no longer found, return the final count
        if (index == -1) {
            return count;
        }

        // Recursive step: Substring was found!
        // 1. Slice the string to only keep the part AFTER the found substring
        String remainingString = inputString.substring(index + substring.length());
        
        // 2. Call the method again with the shortened string and increment the count
        return countSubstring(remainingString, substring, count + 1);
    }

    public static void main(String args[]) {
        // Testing Sample Input 1
        String input1 = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy";
        int count1 = countSubstring(input1, "happy", 0);
        System.out.println("Occurrences of 'happy': " + count1); // Expected: 4

        // Testing Sample Input 2 (Case-sensitive check)
        String input2 = "I felt happy because I saw the others were Happy and because I knew I should feel happy, but I wasn't really happy";
        int count2 = countSubstring(input2, "Happy", 0);
        System.out.println("Occurrences of 'Happy': " + count2); // Expected: 1
    }
}