package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,1,0,-1,-1));
		
		int sumP, sumN, sumZ, arrSize;
		sumP = sumN = sumZ = 0;
		arrSize=arr.size();
		
		for (Integer n : arr){
			if (n > 0) sumP+=1;
			else if (n <0) sumN+=1;
			else sumZ+=1;
			
		}
		
		System.out.println(String.format("%.6f",(float)sumP/arrSize));
		System.out.println(String.format("%.6f",(float)sumN/arrSize));
		System.out.println(String.format("%.6f",(float)sumZ/arrSize));
		
		Formatter fm=new Formatter();
	      fm.format("%1.6e",123.1234567);
	      System.out.println(fm);
	      fm.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
