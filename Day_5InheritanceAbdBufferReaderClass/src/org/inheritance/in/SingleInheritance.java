package org.inheritance.in;
import java.util.Scanner;

class Animal
{
	protected String name;
	public void display()
	{
		System.out.println("the animal id:"+name);
	}
}
class Dog extends Animal
{
	public String Breed;
	public void print()
	{
		System.out.println("the Dos Breed id: "+Breed);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the name of the animal");
		String name1=in.nextLine();
		System.out.println("enter the board of the animal");
		

	}

}
