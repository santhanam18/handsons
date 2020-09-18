package com.car;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		long carNumber,years;
		String carBrand;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your car number");
carNumber = sc.nextLong();
System.out.println("How many years old car do you have");
years = sc.nextLong();
sc.nextLine();
System.out.println("Car Brand");
carBrand = sc.nextLine();
Service s= new Service();
s.setCarNumber(carNumber);
s.setYears(years);
s.setCarBrand(carBrand);
s.sum();
	}

}
