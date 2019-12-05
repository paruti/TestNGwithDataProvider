package com.java;

public class MutableandImmutableString {
	public static void main(String[] args) {

		StringBuffer a = new StringBuffer("Big");
		StringBuffer b = new StringBuffer("Data");
		
		StringBuffer c = a.append(b);
		
		System.out.println("Mutable a "+System.identityHashCode(a));
		System.out.println("Mutable b "+System.identityHashCode(b));
		System.out.println("Mutable c "+System.identityHashCode(c));
		
		System.out.println("\n");
		
		String d = "Big";
		String e = "Data";
		String f = d.concat(e);
		
		System.out.println("Immutable d "+System.identityHashCode(d));
		System.out.println("Immutable e "+System.identityHashCode(e));
		System.out.println("Immutable f "+System.identityHashCode(f));
		
		
		
}
	}