package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ArrayList<Integer>> twoDMatrix = new ArrayList<ArrayList<Integer>>();
		twoDMatrix.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		twoDMatrix.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		twoDMatrix.add(new ArrayList<Integer>(Arrays.asList(9,8,9)));
		
		// 1 2 3 4
		// 3 2 4 1
		// 4 2 1 3
		// 4 1 2 3
		int sumLR = 0;
		int sumRL = 0;
		int matSize = twoDMatrix.size();
		for (int i = 0; i< matSize; i++) {
			sumLR += twoDMatrix.get(i).get(i);
			sumRL += twoDMatrix.get(i).get(matSize - 1 - i);
		}
		
		System.out.println(Math.abs(Math.subtractExact(sumLR, sumRL)));

	}

}
