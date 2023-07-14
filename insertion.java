import java.util.Arrays; // Import the Arrays class from the java.util package

public class GFG { // Declare a public class named GFG
	public static void main(String[] args)
	{ // Declare a public static method named main that
	// accepts a String array as a parameter
		int[] arr
			= new int[3]; // Declare an integer array named
						// arr with three elements
		arr[0] = 1; // Assign the value 1 to the first
					// element of the array
		arr[1] = 2; // Assign the value 2 to the second
					// element of the array
		arr[2] = 3; // Assign the value 3 to the third
					// element of the array
		System.out.println(Arrays.toString(
			arr)); // Print the contents of the array to the
				// console using the Arrays.toString()
				// method
	}
}


