package com.str;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a[] = new Integer[10];
		System.out.println("Enter any 10 values :");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		try {
			for (int j = 0; j < 11; j++) {
				System.out.println("Result : " + (a[j] / a[j]));
			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Elements Over");
		}
	}

}
