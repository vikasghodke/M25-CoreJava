package org.tnsindia.enumdemo;

public enum EnumCardDemo implements InterFaceCardsDemo {
	
	HEART,CLUB,DIAMOND,SPADES;

	@Override
	public void print() {
		System.out.println("Selected Shape in the cards are "+this);
		
	}

}
