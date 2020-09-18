package com.car;

public class Service implements Car
{
	private long carNumber,years;
	private String carBrand;
	public Service()
	{
		
	}
	
public Service(long carNumber, long years, String carBrand) {
		super();
		this.carNumber = carNumber;
		this.years = years;
		this.carBrand = carBrand;
	}

public long getCarNumber() {
	return carNumber;
}

public void setCarNumber(long carNumber) {
	this.carNumber = carNumber;
}

public long getYears() {
	return years;
}

public void setYears(long years) {
	this.years = years;
}

public String getCarBrand() {
	return carBrand;
}

public void setCarBrand(String carBrand) {
	this.carBrand = carBrand;
}
long sum=0;
public void sum()
{
	while(carNumber>0)
	{
		long a = carNumber%10;
		sum+=a;
	}
	System.out.println(sum);
	}
public void years()
{
	
	}
public void brand()
{
	
	}
}
