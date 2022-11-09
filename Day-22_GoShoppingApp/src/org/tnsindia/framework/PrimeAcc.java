package org.tnsindia.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	
	private boolean isPrime;
	static final private float deliverycharges=0.0f;
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account No: "+this.getAccNo()+","+"Account Name: "+this.getAccName()+","+"Charges are: "+this.getCharges());
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
}


