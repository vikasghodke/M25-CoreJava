package org.tnsindia.client;

import org.tnsindia.application.GsNormalAcc;
import org.tnsindia.application.GsprimeAcc;
import org.tnsindia.application.GsshopFactory;
import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GsshopFactory();
		PrimeAcc p=new GsprimeAcc(12234, "ganesh kanade",860,true);
		NormalAcc n=new GsNormalAcc(14674, "vrushali varankar",860,60);
		
		System.out.println("Prime account details: ");
		p.bookProduct(p.getCharges());
		
		System.out.println("Normal account details: ");
		n.bookProduct(n.getCharges());
		
		System.out.println(p);
		System.out.println(n);
		


	}

}
