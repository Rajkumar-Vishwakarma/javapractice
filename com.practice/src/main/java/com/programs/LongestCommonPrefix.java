package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = {"geeksforgeeks", "geeks", "geek", "geezer"};
		List<String> strList = new ArrayList<>(Arrays.asList(strArray));
		
		Integer min = strList.stream().flatMap(ele -> Stream.of(ele.length())).min(Integer::compare).get();
		System.out.println(min);


		Arrays.sort(strArray);
		for (String s : strArray) {
			System.out.println(s);
		}
		
		System.out.println(strArray[1].indexOf("geeks"));
		
		int n = strArray.length;
	       // take temp_prefix string and assign first element of arr : a.
	       String result = strArray[0];
	       
	       // Iterate for rest of element in string.
	       for(int i = 1; i < n; i++){
	            // .indexOf() return index of that substring from string.
	            while(strArray[i].indexOf(result) != 0){
	               
	                // update matched substring prefix
	                result = result.substring(0, result.length()-1);
	               
	                // check for empty case. direct return if true..
	                if(result.isEmpty()){
	                    System.out.println("No match");
	                }
	            }
	        }
	       
	       System.out.println("Longest prefix is "+ result);
		

}
}
