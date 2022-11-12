package org.tnsindia.Client;

import org.tnsindia.appliation.MMBankFactory;
import org.tnsindia.appliation.MMCurruntAcc;
import org.tnsindia.appliation.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurruntAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(5678, "vikas ghodke", 640000, true);
		CurruntAcc c=new MMCurruntAcc(456897, "ab develiers",9500, 500);
		System.out.println("Saving Account Details: ");
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account Details: ");
		c.withdraw(c.getAccBal());
		
	}

}
