package com.gmail.odynets.leonid;

public class Main {

	public static void main(String[] args) {
		// Sides of triangle
		double a = 0.4;
		double b = 0.3;
		double c = 0.5;

		System.out.println("Sides of our triangle is: a = 0.4; b = 0.3; c = 0.5");

		// Half perimeter
		double p = (a + b + c) / 2;

		double form;
		form = p * (p - a) * (p - b) * (p - c);

		// Result
		double S;
		S = Math.sqrt(form);

		System.out.println("Triangle S = " + S);

	}

}
