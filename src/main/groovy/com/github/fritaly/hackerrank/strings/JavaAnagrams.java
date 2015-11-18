package com.github.fritaly.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
	
	private static String sort(String string) {
		final char[] chars = string.toLowerCase().toCharArray();
		
		Arrays.sort(chars);
		
		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();

		System.out.println(sort(A).equals(sort(B)) ? "Anagrams" : "Not Anagrams");
	}
}