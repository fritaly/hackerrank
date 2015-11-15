package com.github.fritaly.hackerrank.strings;

import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();
		String C = A + B;

		System.out.println(C.length());
		System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");
		
		StringBuilder buffer = new StringBuilder();
		buffer.append(Character.toUpperCase(A.charAt(0)));
		buffer.append(A.substring(1));
		buffer.append(" ");
		buffer.append(Character.toUpperCase(B.charAt(0)));
		buffer.append(B.substring(1));
		
		System.out.println(buffer.toString());
	}
}