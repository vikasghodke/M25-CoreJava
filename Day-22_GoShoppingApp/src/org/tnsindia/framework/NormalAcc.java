package org.tnsindia.framework;

public abstract class NormalAcc extends ShopAcc {
	
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accName, float charges, float delivarycharges) {
		super(accNo, accName, charges);
		this.deliveryCharges = delivarycharges;
	}
	public void bookProduct(float charges)
	{
		System.out.println("Account No: "+this.getAccNo()+","+"Account Name: "+this.getAccName()
		+","+"Charges are: "+(charges+deliveryCharges));	
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	

}
