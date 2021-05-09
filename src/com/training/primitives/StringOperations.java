package com.training.primitives;

public class StringOperations {
	public static void main(String[] args) {
		String firstName;
		String lastName;
		String str = null;
		firstName = "Madhan";
		lastName = "Kumar";

		// Convert to UPPER Case
		System.out.println("Convert to UPPER Case: " + firstName.toUpperCase());

		// Length of String
		System.out.println("Length of String: " + firstName.length());

		// Check whether given char is present
		if (firstName.contains("h"))
			System.out.println("String \"Madhan\" contains character \"h\"");
		else
			System.out.println("String contains no character");

		// Equal to Null
		if (str == null)
			System.out.println("String str is Null");
		if (firstName != null)
			System.out.println("String firstName is not Null");

		// String Concat()
		System.out.println("String Concat(): " + firstName.concat(" "+lastName));
		
		System.out.println("String Concat(): " + "Hello"+100);
		
		System.out.println(true&false);
		System.out.println(20 + 30 - -2 * (3 + 4) + 2 + 3 + "Good" + (5 * 2) + 3);
	}
}
