package com.ill;

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

		for (int j = 0; j < 10; j++) {
			System.out.println("Result : " + (a[j] / m));
			try {
				if (m % 2 != 0)
					throw new IllegalArgumentException();
			} catch (IllegalArgumentException ia) {
				System.out.println("Exception handled in the method");
			}
		}
	}

}
