package com.training.primitives;

public class Instance {

	public static void main(String[] args) {
		Instance ins = new Instance();
		Calculate cal1 = null;
		cal1 = ins.new Calculate();
		cal1.number1 = 10;
		cal1.number2 = 5;
		System.out.println("Addition: " + cal1.Add());

		System.out.println("Addition: " + cal1.Sub());
	}

	public class Calculate {
		private int number1;
		private int number2;

		public int Add() {
			return number1 + number2;
		}

		public int Sub() {
			return number1 - number2;
		}
	}
}
