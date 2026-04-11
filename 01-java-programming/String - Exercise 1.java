// Problem Statement

// Complete the removeWhiteSpaces() method given in the Tester class.
// Method Description
// removeWhiteSpaces(String str)
// Remove all the white spaces from the string passed to the method and return the modified string.
// Test the functionalities using the main() method of the Tester class. 

class Tester {

    public static String removeWhiteSpaces(String str) {
        return str.replace(" ", "");
    }

    public static void main(String args[]) {
        String str1 = "Hello  How are you  ";
        String str2 = "J  ava pro  gramming";

        str1 = removeWhiteSpaces(str1);
        str2 = removeWhiteSpaces(str2);

        System.out.println(str1);
        System.out.println(str2);
    }
}
