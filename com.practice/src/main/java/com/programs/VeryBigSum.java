package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  count = 5;
		List<Long> ar = new ArrayList<Long>(Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L));
		
		long sum=0L;
		
		for (Long long1 : ar) {
			sum+=long1;
		}
		
		System.out.println("count = "+count+" sum = " +sum);
	    
	    
	    
	}

}
