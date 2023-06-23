package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImpCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//immutable lists
		List<String> imList = Arrays.asList("s1","s2","s3");
		//imList.add("s4"); //will throw java.lang.UnsupportedOperationException
		System.out.println(imList);
		
		//mutable list
		List<String> mList = new ArrayList<>(Arrays.asList("s1","s2","s3"));
		mList.add("s4"); // will not throw any exception
		System.out.println(mList);
		
		//Collections class
		List<Integer> cList = Collections.emptyList();
		Collections.addAll(cList = new ArrayList<Integer>(), 1,2,3,4);
		System.out.println(cList);
		
		//Collections.unmodifiableList()
		List<Integer> unmList = Collections.unmodifiableList(Arrays.asList(1,2,3));
		System.out.println(unmList);
		
		//Collections.singletonList()
		List<Integer> stList = Collections.singletonList(3);
		System.out.println(stList);
		
		//Java 8 stream
		List<Integer> streamList1 = Stream.of(5,0,8).collect(Collectors.toList());
		List<Integer> streamList2 = Stream.of(11, 12, 13).collect(Collectors.toCollection(ArrayList::new));
		List<Integer> streamList3 = Stream.of(15, 24, 63, 74).collect(Collectors.collectingAndThen(Collectors.toList(), 
                        Collections::unmodifiableList));
		streamList1.add(0);
		System.out.println(streamList1);
		System.out.println(streamList2);
		System.out.println(streamList3);
		
		//Java 9 List.of() unmodifiable list
		List<Integer> unmdList = List.of(5,1,9,5);
		System.out.println(unmdList);
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(53);
		a.add(22);
		
		List<Integer> b = new ArrayList<Integer>();
		b.add(12);
		b.add(54);
		b.add(20);
		
		//2D List
		List<ArrayList<Integer>> twoDMatrix = new ArrayList<ArrayList<Integer>>();
		twoDMatrix.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		twoDMatrix.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		twoDMatrix.add(new ArrayList<Integer>(Arrays.asList(9,8,9)));
		

	}

}
