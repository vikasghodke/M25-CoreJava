package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	static final private float MINBAL=10000.0f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account No.:"+this.getAccNo()+","+"Account Holder Name:"+this.getAccNm()
		+","+"Account Balance is:"+this.getAccBal());
		System.out.println("You can withdraw the money");
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	

}
