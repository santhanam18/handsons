package com.acc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		String san;
Scanner sc = new Scanner(System.in);
CurrentAccount ca = new CurrentAccount();
SavingsAccount sa = new SavingsAccount();
System.out.println("Choose Account Type \n1.Saving Account \n2.Current Account");
n = sc.nextInt();
sc.nextLine();
switch(n)
{
case 1:System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
	san = sc.nextLine();
	String sts[] = san.split(",");
	sa.setAccName(sts[0]);
	sa.setAccNo(sts[1]);
	sa.setBankName(sts[2]);
	sa.setOrgName(sts[3]);
	sa.display();
	break;

case 2:System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
	san = sc.nextLine();
	String ste[] = san.split(",");
	ca.setAccName(ste[0]);
	ca.setAccNo(ste[1]);
	ca.setBankName(ste[2]);
	ca.setTinNumber(ste[3]);
	ca.display();
    break;
}
	}

}
