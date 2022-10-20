package org.tnsindia.generics;

public class GenericMethodExp {
	
	public static <E> void printArray(E []ele)
	{
		for (E itr:ele)
		{
			System.out.println(itr);
		}
	}

	public static void main(String[] args) {
		
		Integer[] arr1= {23,45,67,86};
		Character [] arr2= {'r','y','h','f'};

		System.out.println("printing array for integer");
		printArray(arr1);
		System.out.println("printing array for character");
		printArray(arr2);
	}

}
