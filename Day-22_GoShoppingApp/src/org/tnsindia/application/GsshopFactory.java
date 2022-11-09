package org.tnsindia.application;

import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class GsshopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		GsprimeAcc p=new GsprimeAcc(accNo,accName,charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewnormalAccount(int accNo, String accName, float charges, float deliveryCharges) {
		GsNormalAcc n=new GsNormalAcc(accNo,accName,charges,deliveryCharges);
		return n;
		
			}

}
