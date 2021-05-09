package com.training.primitives;

public class Iterations {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 31, 40, 50, 61, 70 };

		System.out.println("For Loop");
		int i = 0;
		int count = 0;
		for (; i < numbers.length; i++) {
			if ((numbers[i] % 2) == 0) {
				System.out.println(numbers[i]);
				count++;
			}
		}
		System.out.println("Total number of Even Numbers: " + count);
		System.out.println();
		System.out.println("For Each Loop");
		count = 0;
		for (int n : numbers) {
			if ((n % 2) == 0) {
				System.out.println(n);
				count++;
			}
		}
		System.out.println("Total number of Even Numbers: " + count);
	}
}
