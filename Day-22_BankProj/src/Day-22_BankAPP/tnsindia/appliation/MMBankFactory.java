package org.tnsindia.appliation;

import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurruntAcc;
import org.tnsindia.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return s;
	}

	@Override
	public CurruntAcc getNewCurrentAcc1(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurruntAcc c=new MMCurruntAcc(accNo, accNm, creditLimit, creditLimit);
		return c;
	}
	

}
