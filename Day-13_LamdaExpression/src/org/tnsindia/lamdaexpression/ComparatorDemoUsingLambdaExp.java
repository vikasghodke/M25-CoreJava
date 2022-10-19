package org.tnsindia.lamdaexpression;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemoUsingLambdaExp {



	
	public static void main(String[] args, Object str) {
		Comparator<String>obj=(s1,s2)->Integer.compare(s1.length(), s2.length());
		String str1[]={"Vikas","Dhanashri","mahendrasingh","virat"};
		Collections.sort(Arrays.asList(str1),obj);
		
		for(String itr:str1)
		{
			System.out.println(itr+" ");
		}
		

	}

}
