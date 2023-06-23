package com.programs;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("gthhrrf");
		sb.reverse();
		System.out.println(sb);
		String str = "my hs ajjs ms ";
		char[] arr = str.toCharArray();
		String newStr = "";
		
		List<Character> lc = new ArrayList<Character>();
		for (char c : arr) {
			if  (!lc.contains(c)) {
				lc.add(c);
			}
		}
		System.out.println(lc);
		
		for (Character ch : lc) {
			newStr += ch;
		}
		System.out.println(newStr);
		
		

	}

}
