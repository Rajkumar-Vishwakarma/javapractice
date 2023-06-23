package com.programs;

import java.util.Scanner;

public class StringFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name ");
		
        String inp = sc.next();
        System.out.print("Enter number ");
        byte num = sc.nextByte();
        sc.close();
       
        System.out.println(String.format("%-15s", inp)+String.format("%03d",num));
	}

}
