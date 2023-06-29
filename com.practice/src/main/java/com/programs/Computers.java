package com.programs;

import java.util.ArrayList;
import java.util.List;

public class Computers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		given an int N and a string of length equal to this int. 
		The string will contain either 'S' or '.'
		N - no of tables
		S - student is seated
		. - seat is empty
		Two students can share a computer. A student can use a computer if it is to his 
		immediate right or immediate left. We need to find min no of computers needed 
		to accommodate all students or return -1 if all students can't be accommodated. 
		*/
		
		
		int result = 0;
		int min = 0;
		String lab = ".S.S..S.S...SS..SS..S..S.S";
		int n = lab.length();
		int noOfStudents = 0;
		List<Integer>stdIndex = new ArrayList<>();
		char[] charArr = lab.toCharArray();
		for (int i=0;i<charArr.length;i++) {
			if (charArr[i] == 'S') {
				noOfStudents++;
				stdIndex.add(i);
			}
		}
		
		System.out.println(noOfStudents);
		System.out.println(stdIndex);
		
		for (int i =0;i<stdIndex.size();i++) {
			if (stdIndex.get(i)==0) {
				if (charArr[stdIndex.get(i)+1] == '.') {
					result++;
				}
				else {
					result = -1;
					break;
				}
			}
			else if (stdIndex.get(i)==lab.length()-1) {
				if (charArr[stdIndex.get(i)-1] == '.') {
					result++;
				}
				else {
					result = -1;
					break;
				}
			}
			else if (charArr[stdIndex.get(i)-1] == '.' || charArr[stdIndex.get(i)+1] == '.') {
				result++;
			}
			
			if (i+1<stdIndex.size()) {
				if (Math.abs(Math.subtractExact(stdIndex.get(i), stdIndex.get(i+1))) == 2) {
					min++;
				}
			}
		}
		
		
		if (result != -1) {
			System.out.println("Max computer = "+result);
			System.out.println("Min computer = "+(result-min));
		}
		else {
			System.out.println("All students cant be served with computers");
		}
		
		

	}

}
