package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "we have to reverse this string";
		System.out.println(str);
		List<String> splitList = new ArrayList<>(Arrays.asList(str.split(" ")));
		
		for (int i =splitList.size()-1;i>=0;i--) {
			System.out.print(splitList.get(i)+" ");
		}
		
		
		
	}

}
