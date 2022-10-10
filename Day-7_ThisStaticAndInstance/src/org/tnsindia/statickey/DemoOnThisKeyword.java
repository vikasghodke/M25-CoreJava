package org.tnsindia.statickey;

class B
{
	public String name;
	public int id;
	B(String name, int id)
	{
		this.name=name;
		this.id=id;
	}
	public void print()
	{
		System.out.println("the name is="+name);
		System.out.println("the id is="+id);
	}
}

public class DemoOnThisKeyword {

	public static void main(String[] args) {
		B a=new B("vikas",5484);
		a.print();
		
		

	}

}
