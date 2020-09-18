package com.cos;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		String sen,san;
		Scanner sc = new Scanner(System.in);
   System.out.println("Enter Humpty's Sentence");
   sen = sc.nextLine();
   System.out.println("Enter Dumpty's Sentence");
   san = sc.nextLine();
   System.out.println("Concatenated String :"+sen+"."+san);
	}

}
