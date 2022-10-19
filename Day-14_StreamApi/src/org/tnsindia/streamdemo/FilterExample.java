package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FilterExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList(new String[]{"nayan","lekha","sushma","bhakti"});		
		
		obj.stream().filter((i->i.length()>3)).forEach((Consumer<? super String>)i->System.out.println(i+" "));
	}

}
