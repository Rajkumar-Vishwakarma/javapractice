package com.programs;
import java.util.ArrayList;
import java.util.List;

public class CompareTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(53);
		a.add(22);

		List<Integer> b = new ArrayList<>();
		b.add(12);
		b.add(54);
		b.add(20);

		List<Integer> scores = new ArrayList<>();
		int score1 = 0;
		int score2 = 0;

		for(int i=0;i<a.size();i++) {
			if (a.get(i) > b.get(i)) {
				score1 = score1+1;
			}

			else if (a.get(i) < b.get(i)) {
				score2 = score2+1;
			}
		}
		scores.add(score1);
		scores.add(score2);

		System.out.println("Final score is : a = " + scores.get(0) + " b = " + scores.get(1));

	}

}
