package com.ari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		Integer a[] = new Integer[10];
		System.out.println("Enter any 10 values :");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Divisor");
		m = sc.nextInt();
		try {
			for (int j = 0; j < 10; j++) {
				System.out.println("Result : " + (a[j] / m));
			}
		} catch (ArithmeticException ae) {
			System.out.println("Can not divide by zero");
		}
	}
}
