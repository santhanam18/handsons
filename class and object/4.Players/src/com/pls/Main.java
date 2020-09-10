package com.pls;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String players;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player details");
		players = sc.nextLine();
		String []str = players.split(",");
		System.out.println("Player Details");
		System.out.println("Player Name:"+str[0]);
		System.out.println("Country Name:"+str[1]);
		System.out.println("Skill:"+str[2]);
	}

}
