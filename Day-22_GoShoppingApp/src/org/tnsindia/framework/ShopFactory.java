package org.tnsindia.framework;

public abstract class ShopFactory {
	
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime);
	public abstract NormalAcc getNewnormalAccount(int accNo, String accName, float charges, float deliveryCharges);

}
