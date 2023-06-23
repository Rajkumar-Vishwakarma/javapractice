package com.programs;


import java.util.Hashtable;
import java.util.Map;

public class MaxOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Letter";
		char maxOcc= Character.MIN_VALUE;
		char[] ca = str.toCharArray();
		
		
		Hashtable<Character, Integer> hm = new Hashtable<Character, Integer>();
		for (char a : ca) {
			if (!hm.containsKey(a)) {
				hm.put(a, 1);
			}
			else {
				hm.put(a, hm.get(a)+1);
			}
		}
		
		System.out.println(hm);
		
		int max =0;
		
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() > max) {
				max = e.getValue();
			}
		}
		
		System.out.println(max);
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			if (e.getValue() == max) {
				maxOcc = e.getKey();
			}
		}
		
		System.out.println("In the string '"+str+ "', character "+ maxOcc+ " is repeated "+ max+" times");

	}

}
