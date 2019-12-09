package com.photon;

public class SplitConcepts {
	public static void main(String[] args) {
		String s = "I am the one of the Good person Good in the World";
		String[] s1 = s.split("Good",4);
		for (String s2 : s1) {
			System.out.println(s2);
		}
		
	}

}
