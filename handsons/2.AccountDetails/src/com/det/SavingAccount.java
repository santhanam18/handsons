package com.det;


public class SavingAccount extends Account
{
	  protected double minimumBalance;
	  public SavingAccount()
	  {
		  
	  }
	public SavingAccount(double minimumBalance) {
		super();
		this.minimumBalance = minimumBalance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}


}
