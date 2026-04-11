// Problem Statement
// Try out the below code and observe the output.

//Program to illustrate the use of multidimensional array  
class Tester {
	public static void main(String[] args) {
		// Declaring and initializing 2D array
		int[][] dayWiseTemperature = new int[][] { { 29, 21 }, { 24, 23 },
				{ 26, 22 }, { 28, 23 }, { 29, 24 }, { 23, 20 }, { 29, 21 } };

		// Displaying 2D array
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0)
					System.out.println("Max Temperature is "
							+ dayWiseTemperature[i][j] + " on day " + i);
				else
					System.out.println("Min Temperature is "
							+ dayWiseTemperature[i][j] + " on day " + i);
			}
		}
	}
}
