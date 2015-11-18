package com.github.fritaly.hackerrank.strings;

import java.util.Scanner;

public class JavaStringReverse {
	
	private static String reverse(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();

		System.out.println(A.equals(reverse(A)) ? "Yes" : "No");
	}
}