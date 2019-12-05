package com.java;

import java.security.Identity;

public class LiteralStringandNonLiteralString {
	public static void main(String[] args) {

		String a = "Parthi";
		String b = "Parthi";
		
		System.out.println("Literal :a "+System.identityHashCode(a));
		System.out.println("Literal :b "+System.identityHashCode(b));
		
		String c = new String("Parthi");
		String d = new String("Parthi");
		
		System.out.println("Non-Literal :c "+System.identityHashCode(c));
		System.out.println("Non-Literal :d "+System.identityHashCode(d));
		

	}
}