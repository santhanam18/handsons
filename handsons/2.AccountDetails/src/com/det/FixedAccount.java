package com.det;

public class FixedAccount extends SavingAccount
{
private Integer lockingPeriod;
public FixedAccount()
{
	}
public FixedAccount(Integer lockingPeriod) {
	super();
	this.lockingPeriod = lockingPeriod;
}
public Integer getLockingPeriod() {
	return lockingPeriod;
}
public void setLockingPeriod(Integer lockingPeriod) {
	this.lockingPeriod = lockingPeriod;
}
}
