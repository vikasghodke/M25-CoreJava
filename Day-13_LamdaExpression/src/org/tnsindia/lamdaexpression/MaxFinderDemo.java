package org.tnsindia.lamdaexpression;

public class MaxFinderDemo {
	
	abstract void max(int a,int b);

}
class MaxFinderChildDemo implements MaxFinderDemo
{
	public void max(int a,int b) {
		int result=(a>b)?a:b;
		System.out.println("the maximum number is:"+result);
	}
	
}
