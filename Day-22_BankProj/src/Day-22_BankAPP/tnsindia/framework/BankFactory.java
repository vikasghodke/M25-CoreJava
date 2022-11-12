package org.tnsindia.framework;

public abstract class BankFactory {
	
public abstract SavingAcc getNewSavingAcc (int accNo, String accNm, float accBal, boolean isSalaried);
	
	public abstract CurruntAcc getNewCurrentAcc1(int accNo, String accNm, float accBal, float creditLimit);


}
