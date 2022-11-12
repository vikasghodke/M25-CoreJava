package org.tnsindia.framework;

public abstract class CurruntAcc extends BankAcc{
	private final float creditLimit;

	public CurruntAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	public void withdraw (float accBal)
	{
		System.out.println("Account No.:"+this.getAccNo()+","+"Account Holder Name:"+this.getAccNm()
		+","+"Account Balance is:"+(accBal+creditLimit));
		System.out.println("You cannot withdraw money if your balance is less than "+(accBal+creditLimit));
	}
	@Override
	public String toString() {
		return "CurruntAcc [creditLimit=" + creditLimit + "]";
	}
	

}
