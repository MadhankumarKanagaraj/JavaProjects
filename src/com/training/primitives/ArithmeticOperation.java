package com.training.primitives;

public class ArithmeticOperation {
	private int number1;
	private int number2;

	public int Add() {
		return number1 + number2;
	}

	public int Sub() {
		return number1 - number2;
	}

	public static void main(String[] args) {
		ArithmeticOperation operation = new ArithmeticOperation();
		operation.number1 = 10;
		operation.number2 = 5;
		System.out.println("Addition: " + operation.Add());

		System.out.println("Addition: " + operation.Sub());
	}
}
